package com.hzh.webx.services;

import com.hzh.webx.mapper.OrderMapper;
import com.hzh.webx.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huangzehai on 2017/3/31.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    private Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private AddressService addressService;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrder(Order order) {
        logger.info("Save order information");
        orderMapper.addOrder(order);
        try {
            addressService.saveAddress(order.getAddress());
        } catch (RuntimeException e) {
//            TransactionStatus txStatus = TransactionAspectSupport.currentTransactionStatus();
//            logger.error(txStatus.toString());
            logger.error(e.getMessage());
        }

    }
}

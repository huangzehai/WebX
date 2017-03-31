package com.hzh.webx.services;

import com.hzh.webx.mapper.OrderMapper;
import com.hzh.webx.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huangzehai on 2017/3/31.
 */
@Service
public class OrderServiceImpl implements OrderService {
    private Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private AddressService addressService;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    public void saveOrder(Order order) {
        logger.info("Save order information");
        addressService.saveAddress(order.getAddress());
        orderMapper.addOrder(order);
    }
}

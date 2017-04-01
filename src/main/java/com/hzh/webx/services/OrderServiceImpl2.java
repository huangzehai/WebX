package com.hzh.webx.services;

import com.hzh.webx.mapper.OrderMapper;
import com.hzh.webx.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by huangzehai on 2017/4/1.
 */
@Service("orderService2")
public class OrderServiceImpl2 implements OrderService {

    @Autowired
    private AddressService addressService;
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private PlatformTransactionManager txManager;

    @Override
    public void saveOrder(Order order) {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = txManager.getTransaction(def);
        try {
            orderMapper.addOrder(order);
            addressService.saveAddress(order.getAddress());
        } catch (RuntimeException ex) {
            txManager.rollback(status);
//            throw ex;
        }
        txManager.commit(status);
    }
}

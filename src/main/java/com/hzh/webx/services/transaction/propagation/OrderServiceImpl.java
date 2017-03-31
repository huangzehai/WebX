package com.hzh.webx.services.transaction.propagation;

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

    @Override
    @Transactional
    public void saveOrder() {
        logger.info("Save order information");
        addressService.saveAddress();
    }
}

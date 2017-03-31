package com.hzh.webx.services.transaction.propagation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huangzehai on 2017/3/31.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private AddressService addressService;

    @Override
    @Transactional
    public void saveOrder() {
        System.out.println("Save order information");
        addressService.saveAddress();
    }
}

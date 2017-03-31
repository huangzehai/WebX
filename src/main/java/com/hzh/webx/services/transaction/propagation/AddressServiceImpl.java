package com.hzh.webx.services.transaction.propagation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huangzehai on 2017/3/31.
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Override
    @Transactional
    public void saveAddress() {
        System.out.println("Saving delivery address.");
        throw new RuntimeException("Fail to save delivery address.");
    }
}

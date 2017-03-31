package com.hzh.webx.services;

import com.hzh.webx.mapper.AddressMapper;
import com.hzh.webx.model.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huangzehai on 2017/3/31.
 */
@Service
public class AddressServiceImpl implements AddressService {

    private Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

    @Autowired
    private AddressMapper addressMapper;

    @Override
    @Transactional
    public void saveAddress(Address address) {
        logger.info("Saving delivery address.");
        addressMapper.addAddress(address);
//        throw new RuntimeException("Fail to save delivery address.");
    }
}

package com.hzh.webx.services.transaction.propagation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huangzehai on 2017/3/31.
 */
@Service
public class AddressServiceImpl implements AddressService {
    private Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

    @Override
    @Transactional
    public void saveAddress() {
        logger.info("Saving delivery address.");
        throw new RuntimeException("Fail to save delivery address.");
    }
}

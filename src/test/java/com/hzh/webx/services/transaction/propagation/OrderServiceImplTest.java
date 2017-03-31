package com.hzh.webx.services.transaction.propagation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by huangzehai on 2017/3/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({
        @ContextConfiguration("/root-context.xml"),
        @ContextConfiguration("/dispatcher-servlet.xml")
})
public class OrderServiceImplTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void saveOrder() throws Exception {
        orderService.saveOrder();
    }

}
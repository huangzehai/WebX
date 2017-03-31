package com.hzh.webx.services;

import com.hzh.webx.model.Address;
import com.hzh.webx.model.Order;
import com.hzh.webx.services.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by huangzehai on 2017/3/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextHierarchy({
        @ContextConfiguration("/root-context.xml"),
        @ContextConfiguration("/dispatcher-servlet.xml")
})
public class OrderServiceImplTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void saveOrder() throws Exception {
        Address address = new Address();
        address.setAddressId(1);
        address.setCountry("China");
        address.setProvince("Guangdong");
        address.setCity("Shenzhen");
        address.setStreet("haide 2rd");
        address.setZipCode("518000");
        Order order = new Order();
        order.setOrderId(1);
        order.setAddress(address);
        orderService.saveOrder(order);
    }

}
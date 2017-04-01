package com.hzh.webx.controllers;

import com.hzh.webx.model.Address;
import com.hzh.webx.model.Order;
import com.hzh.webx.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangzehai on 2017/3/31.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("add")
    public Order addOrder() {
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
        return order;
    }
}

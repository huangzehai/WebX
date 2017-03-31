package com.hzh.webx.model;

/**
 * Created by huangzehai on 2017/3/31.
 */
public class Order {
    private int orderId;
    private Address address;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", address=" + address +
                '}';
    }
}

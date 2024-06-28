package com.wzf.model;

import java.io.Serializable;
import java.util.HashMap;

public class Order implements Serializable {
    Long orderId;//订单Id
    Consumer consumer;

    HashMap<Fruit, Integer> fruitNum;

    int totalPrice;//总价

    public Order() {
    }


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}

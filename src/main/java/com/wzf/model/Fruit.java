package com.wzf.model;

import java.io.Serializable;

/**
 * 水果模型
 */
public class Fruit implements Serializable {
    Long fruitId;//水果Id
    String fruitName;//水果名

    double price;//单价， 斤/元

    public Fruit() {
    }

    public Fruit(Long fruitId, String fruitName, double price) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
    }

    public Long getFruitId() {
        return fruitId;
    }

    public void setFruitId(Long fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

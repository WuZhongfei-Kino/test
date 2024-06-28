package com.wzf.model;

import java.io.Serializable;

public class Consumer implements Serializable {
    Long consumerId;//消费者Id

    String consumerName;//消费者名称

    public Consumer() {
    }

    public Consumer(Long consumerId, String consumerName) {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
    }

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }
}

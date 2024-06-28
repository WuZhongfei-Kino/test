package com.wzf.service;


import org.springframework.core.env.Environment;

public interface ConsumerService {

    /**
     * * 获取水果总价
     * * @param environment 环境变量
     * @param consumerName 消费者名称
     * @param appleNum 苹果斤数
     * @param strawNum 草莓斤数
     * @param mangoNum 芒果斤数
     * @return
     */
    String getFruitTotal(Environment environment, String consumerName, int appleNum, int strawNum, int mangoNum);
}

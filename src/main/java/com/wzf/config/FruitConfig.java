package com.wzf.config;

import com.wzf.model.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class FruitConfig {

    private Environment environment;


    public List<Fruit> getFruitList(Environment environment){
        this.environment = environment;
        List<Fruit> fruitList = new ArrayList<>();
        //初始化水果信息
        Fruit fruit = new Fruit();

        fruit.setFruitId(Long.valueOf(environment.getProperty("apple.id")));
        fruit.setFruitName(environment.getProperty("apple.name"));
        fruit.setPrice(Double.valueOf(environment.getProperty("apple.price")));
        fruitList.add(fruit);

        fruit.setFruitId(Long.valueOf(environment.getProperty("strawberry.id")));
        fruit.setFruitName(environment.getProperty("strawberry.name"));
        fruit.setPrice(Double.valueOf(environment.getProperty("strawberry.price")));
        fruitList.add(fruit);

        fruit.setFruitId(Long.valueOf(environment.getProperty("mango.id")));
        fruit.setFruitName(environment.getProperty("mango.name"));
        fruit.setPrice(Double.valueOf(environment.getProperty("mango.price")));
        fruitList.add(fruit);

        return fruitList;

    }

}

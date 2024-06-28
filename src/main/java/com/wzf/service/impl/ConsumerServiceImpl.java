
package com.wzf.service.impl;

import com.wzf.config.FruitConfig;
import com.wzf.model.Order;
import com.wzf.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ConsumerServiceImpl implements ConsumerService {
    private Environment environment;

    @Autowired
    private FruitConfig fruitConfig;

    /**
     * 获取水果总价
     * @param consumerName 消费者名称
     * @param appleNum 苹果斤数
     * @param strawNum 草莓斤数
     * @param mangoNum 芒果斤数
     * @return
     */
    @Override
    public String getFruitTotal(Environment environment, String consumerName, int appleNum, int strawNum, int mangoNum) {
        BigDecimal total;
        String result = "";
        this.environment = environment;
        if (StringUtils.isEmpty(consumerName)){
            result = "请先选择结算顾客！";
        } else {
            result += "顾客:" + consumerName+"\n";
            if (appleNum < 0 && strawNum < 0 && mangoNum < 0){
                return "所选水果的斤数须为正数";
            } else {
                //判断水果斤数是否为正整数
                if (appleNum < 0 && appleNum % 1 != 0){
                    return "所选苹果的斤数须为正整数";
                }
                if (strawNum < 0 && strawNum % 1 != 0){
                    return "所选草莓的斤数须为正整数";
                }
                if (mangoNum < 0 && mangoNum % 1 != 0){
                    return "所选芒果的斤数须为正整数";
                }
                switch (consumerName) {
                    case "A" : result += consumerATotal(environment, appleNum, strawNum, mangoNum); break;
                    case "B" : result += consumerBTotal(environment, appleNum, strawNum, mangoNum); break;
                    case "C" : result += consumerCTotal(environment, appleNum, strawNum, mangoNum); break;
                    case "D" : result += consumerDTotal(environment, appleNum, strawNum, mangoNum); break;
                }
            }
        }
        return result;
    }

    /**
     * 顾客A的总价
     * @return
     */
    public static String consumerATotal(Environment environment, int appleNum, int strawNum, int mangoNum){
        Double total = 0d;
        String result = "";

        Double applePrice = Double.valueOf(environment.getProperty("apple.price"));
        Double strawPrice = Double.valueOf(environment.getProperty("strawberry.price"));
        result += "商品名称:"+environment.getProperty("apple.name") + ",商品价格(元/斤):" + applePrice + ", 购买数量:" + appleNum+";\n";
        result += "商品名称:"+environment.getProperty("strawberry.name") + ",商品价格(元/斤):" + strawPrice + ", 购买数量:" + strawNum+";\n";

        total += appleNum == 0 ? 0: appleNum * applePrice;
        total += strawNum == 0 ? 0 : strawNum * strawPrice;

        result += "总共:"+ total +"元";
        return  result;
    }


    /**
     * 顾客B的总价
     * @return
     */
    public static String consumerBTotal(Environment environment, int appleNum, int strawNum, int mangoNum){
        Double total = 0d;
        String result = "";
        Double applePrice = Double.valueOf(environment.getProperty("apple.price"));
        Double strawPrice = Double.valueOf(environment.getProperty("strawberry.price"));
        Double mangoPrice = Double.valueOf(environment.getProperty("mango.price"));
        result += "商品名称:"+environment.getProperty("apple.name") + ",商品价格(元/斤):" + applePrice + ", 购买数量:" + appleNum+";\n";
        result += "商品名称:"+environment.getProperty("strawberry.name") + ",商品价格(元/斤):" + strawPrice + ", 购买数量:" + strawNum+";\n";
        result += "商品名称:"+environment.getProperty("mango.name") + ",商品价格(元/斤):" + mangoPrice + ", 购买数量:" + mangoNum+";\n";

        total += appleNum == 0 ? 0 : appleNum * applePrice;
        total += strawNum == 0 ? 0 : strawNum * strawPrice;
        total += mangoNum == 0 ? 0 : mangoNum * mangoPrice;

        result += "总共:"+ total +"元";
        return  result;
    }


    /**
     * 顾客C的总价
     * @return
     */
    public static String consumerCTotal(Environment environment,int appleNum, int strawNum, int mangoNum){
        Double total = 0d;
        String result = "";
        Double applePrice = Double.valueOf(environment.getProperty("apple.price"));
        Double strawPrice = Double.valueOf(environment.getProperty("strawberry.price"));
        Double mangoPrice = Double.valueOf(environment.getProperty("mango.price"));
        result += "商品名称:"+environment.getProperty("apple.name") + ",商品价格(元/斤):" + applePrice + ", 购买数量:" + appleNum+";\n";
        result += "商品名称:"+environment.getProperty("strawberry.name") + ",商品价格(元/斤):" + strawPrice + ", 购买数量:" + strawNum+";\n";
        result += "商品名称:"+environment.getProperty("mango.name") + ",商品价格(元/斤):" + mangoPrice + ", 购买数量:" + mangoNum+";\n";

        total += appleNum == 0 ? 0 : appleNum * applePrice;
        total += strawNum == 0 ? 0 : strawNum * (strawPrice * 0.8);
        total += mangoNum == 0 ? 0 : mangoNum * mangoPrice;
        result += "总共:"+ total +"元";
        return  result;
    }


    /**
     * 顾客D的总价
     * @return
     */
    public static String consumerDTotal(Environment environment, int appleNum, int strawNum, int mangoNum){
        Double total = 0d;
        String result = "";
        Double applePrice = Double.valueOf(environment.getProperty("apple.price"));
        Double strawPrice = Double.valueOf(environment.getProperty("strawberry.price"));
        Double mangoPrice = Double.valueOf(environment.getProperty("mango.price"));
        result += "商品名称:"+environment.getProperty("apple.name") + ",商品价格(元/斤):" + applePrice + ", 购买数量:" + appleNum+";\n";
        result += "商品名称:"+environment.getProperty("strawberry.name") + ",商品价格(元/斤):" + strawPrice + ", 购买数量:" + strawNum+";\n";
        result += "商品名称:"+environment.getProperty("mango.name") + ",商品价格(元/斤):" + mangoPrice + ", 购买数量:" + mangoNum+";\n";

        total += appleNum == 0 ? 0 : appleNum * applePrice;
        total += strawNum == 0 ? 0 : strawNum * strawPrice;
        total += mangoNum == 0 ? 0 : mangoNum * mangoPrice;
        total = total > 100 ? total - 10 : total;
        result += "总共:"+ total +"元";
        return  result;

    }
}

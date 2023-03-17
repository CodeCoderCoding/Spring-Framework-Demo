package com.supremepole.springel.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanExpressionContext;


/**
 * SpEL bean相关：获取bean属性、方法调用、构造方法
 */
public class SpringELBean {

    @Value("#{dog.getString()}")
    private String string;

    public void output(){
        System.out.println(string);
    }

}

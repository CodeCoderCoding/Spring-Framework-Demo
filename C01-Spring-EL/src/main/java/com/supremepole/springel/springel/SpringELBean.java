package com.supremepole.springel.springel;

import org.springframework.beans.factory.annotation.Value;


/**
 * SpEL bean相关：获取bean属性、方法调用、构造方法
 */
public class SpringELBean {

    @Value("#{dog.getString()}")
    private String string;

    // 注入其他bean的属性
    @Value("#{person.name}")
    private String personName;

    // 注入其他bean的属性，和上面的写法等价
    @Value("#{person['name1']}")
    private String personName1;


    public void output(){
        System.out.println(string);
        System.out.println(personName);
        System.out.println(personName1);
    }

}

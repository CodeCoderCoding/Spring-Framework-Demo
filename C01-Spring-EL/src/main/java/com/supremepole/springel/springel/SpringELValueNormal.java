package com.supremepole.springel.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * SpEL 注入字面值
 */
@Component
public class SpringELValueNormal {

    // 注入普通字符串
    @Value("normalString")
    private String normalString;

    // 注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    // 注入其他bean的属性
//    @Value("#{person.name}")
//    private String personName;

    // 注入其他bean的属性，和上面的写法等价
    @Value("#{person['name1']}")
    private String personName1;


    public void output(){
        System.out.println(normalString);
        System.out.println(osName);
//        System.out.println(personName);
        System.out.println(personName1);
    }

}
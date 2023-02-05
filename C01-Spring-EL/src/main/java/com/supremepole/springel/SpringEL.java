package com.supremepole.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringEL {

    // 注入普通字符串
    @Value("normalString")
    private String normalString;

    // 注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    // 注入其他bean的属性
    @Value("#{person.name}")
    private String personName;

    public void output(){
        System.out.println(normalString);
        System.out.println(osName);
        System.out.println(personName);
    }

}

package com.supremepole.springel.springel;

import org.springframework.beans.factory.annotation.Value;

/**
 * SpEL 注入操作系统值
 */
public class SpringELValueOS {

    // 注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;


    public void output(){
        System.out.println(osName);
    }

}

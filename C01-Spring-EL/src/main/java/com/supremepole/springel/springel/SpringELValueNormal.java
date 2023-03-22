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

    public void output(){
        System.out.println(normalString);
    }

}

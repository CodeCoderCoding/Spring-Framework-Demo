package com.supremepole.springel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        SpringEL springEL =context.getBean(SpringEL.class);
        springEL.output();
        context.close();
    }

}

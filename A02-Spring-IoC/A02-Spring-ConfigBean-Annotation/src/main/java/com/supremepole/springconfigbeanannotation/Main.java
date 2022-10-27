package com.supremepole.springconfigbeanannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class); //1
        UseFunctionService useFunctionService = applicationContext.getBean(UseFunctionService.class); //2
        System.out.println(useFunctionService.SayHello("World"));
        applicationContext.close();
    }

}

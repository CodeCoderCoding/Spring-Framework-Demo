package com.supremepole.springconfigbeanjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class); //1
        UseFunctionService useFunctionService = applicationContext.getBean(UseFunctionService.class); //2
        System.out.println(useFunctionService.SayHello("JavaConfig"));
        applicationContext.close();
    }

}

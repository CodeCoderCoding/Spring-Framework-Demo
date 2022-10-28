package com.supremepole.springconfigbeanxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UseFunctionService useFunctionService = applicationContext.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("World"));
    }

}

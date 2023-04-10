package com.supremepole.springfactorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object object=  applicationContext.getBean("websiteFactoryBean");
        Object object1= (WebsiteFactoryBean) applicationContext.getBean("&websiteFactoryBean");
        System.out.println(object.getClass().getName());
        System.out.println(object1.getClass().getName());
    }

}

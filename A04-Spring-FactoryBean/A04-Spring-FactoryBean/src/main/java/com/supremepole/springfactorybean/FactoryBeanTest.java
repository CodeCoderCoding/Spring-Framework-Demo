package com.supremepole.springfactorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {

    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object object=  applicationContext.getBean("factoryBeanPojo");
        FactoryBeanPojo factoryBeanPojo= (FactoryBeanPojo) applicationContext.getBean("&factoryBeanPojo");
        System.out.println(object.getClass().getName());
        System.out.println(factoryBeanPojo.getClass().getName());
    }

}

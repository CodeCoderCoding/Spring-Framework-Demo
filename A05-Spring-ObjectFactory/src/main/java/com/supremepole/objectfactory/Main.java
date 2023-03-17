package com.supremepole.objectfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Main {
    @Autowired
    private static Dog dog;
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object object=applicationContext.getBean("myBeanObjectFactory");
//        System.out.println(object.getClass().getName());
//        Cat cat= (Cat) applicationContext.getBean("cat");
//        Dog dog= (Dog) applicationContext.getBean("dog");
//        System.out.println(dog.getMapInDog());
        //System.out.println(dog.getObjectInDog().getClass().getName());
//        System.out.println(dog.getMapInDog());
    }

}

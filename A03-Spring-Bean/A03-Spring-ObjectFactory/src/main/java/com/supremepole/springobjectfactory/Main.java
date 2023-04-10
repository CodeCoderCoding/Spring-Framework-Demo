package com.supremepole.springobjectfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyBean myBean=(MyBean) applicationContext.getBean("myBean");
        myBean.print();
    }

}

package com.supremepole.springobjectfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;

import java.io.Serializable;

public class MyBeanObjectFactory implements ObjectFactory<MyBean>, Serializable {

    public MyBeanObjectFactory(){
        System.out.println("MyBeanObjectFactory");
    }

    @Override
    public MyBean getObject() throws BeansException{
        return new MyBean();
    }

}

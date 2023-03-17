package com.supremepole.springel.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanExpressionContext;

public class SpringELgetObject {

    // this为BeanExpressionContext
    @Value("#{#this.toString()}")
    private String string;

    @Value("#{getObject('person')}")
    private Object objectPerson;

    // 与上面的这种写法一样
    @Value("#{#this.getObject('person')}")
    private Object objectPersonWithThis;

    public void outputString(){
        System.out.println(string);
    }

    public void outputObjectPerson(){
        System.out.println(objectPerson);
    }

    public void outputObjectPersonWithThis(){
        System.out.println(objectPersonWithThis);
    }

}

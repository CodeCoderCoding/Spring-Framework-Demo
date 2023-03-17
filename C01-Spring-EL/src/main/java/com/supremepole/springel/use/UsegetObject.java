package com.supremepole.springel.use;

import com.supremepole.springel.JavaConfig;
import com.supremepole.springel.springel.SpringELBean;
import com.supremepole.springel.springel.SpringELgetObject;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsegetObject {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        SpringELgetObject springELgetObject=context.getBean(SpringELgetObject.class);
        springELgetObject.outputString();
        context.close();
    }

}

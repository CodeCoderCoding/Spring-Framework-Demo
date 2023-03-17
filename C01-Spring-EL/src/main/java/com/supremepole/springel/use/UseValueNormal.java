package com.supremepole.springel.use;

import com.supremepole.springel.JavaConfig;
import com.supremepole.springel.springel.SpringELValueNormal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseValueNormal {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        SpringELValueNormal springELValueNormal =context.getBean(SpringELValueNormal.class);
        springELValueNormal.output();
        context.close();
    }

}

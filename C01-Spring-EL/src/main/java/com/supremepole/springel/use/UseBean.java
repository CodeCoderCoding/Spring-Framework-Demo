package com.supremepole.springel.use;

import com.supremepole.springel.JavaConfig;
import com.supremepole.springel.springel.SpringELBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseBean {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        SpringELBean springELBean=context.getBean(SpringELBean.class);
        springELBean.output();
        context.close();
    }

}

package com.supremepole.springinitdestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author CodeCoderCoding
 */
public class BeanAnnotation {
    @PostConstruct
    public void init(){
        System.out.println("java配置的方式初始化bean");
    }

    public BeanAnnotation(){
        System.out.println("bean注解中的构造方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("java配置的方式销毁bean");
    }
}

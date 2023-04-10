package com.supremepole.springinitdestroy;

/**
 * @author CodeCoderCoding
 */
public class BeanJavaConfig {
    public void init() {
        System.out.println("java配置的方式初始化bean");
    }
    public BeanJavaConfig(){
        System.out.println("bean注解中的构造方法");
    }
    public void destroy(){
        System.out.println("java配置的方式销毁bean");
    }
}

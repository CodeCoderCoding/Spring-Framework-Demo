package com.supremepole.springfactorybean;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanPojo implements FactoryBean {

    private String type;

    @Override
    public Object getObject() throws Exception {
        if("dog".equals(type)){
            return new Dog();
        }else{
            return new Cat();
        }

    }

    @Override
    public Class getObjectType() {
        return Cat.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

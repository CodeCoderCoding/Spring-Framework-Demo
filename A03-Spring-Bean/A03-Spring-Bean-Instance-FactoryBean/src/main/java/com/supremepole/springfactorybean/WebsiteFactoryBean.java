package com.supremepole.springfactorybean;

import org.springframework.beans.factory.FactoryBean;

public class WebsiteFactoryBean implements FactoryBean<Website> {

    private String name;
    private String url;

    public WebsiteFactoryBean(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public Website getObject() throws Exception {
        Website website=new Website();
        website.setName(name);
        website.setUrl(url);
        return website;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

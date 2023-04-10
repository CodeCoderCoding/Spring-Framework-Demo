package com.supremepole.springstaticfactory;

public class ServiceFactory {

    public static WebsiteServiceImpl createWebsiteService(){
        return new WebsiteServiceImpl();
    }

}

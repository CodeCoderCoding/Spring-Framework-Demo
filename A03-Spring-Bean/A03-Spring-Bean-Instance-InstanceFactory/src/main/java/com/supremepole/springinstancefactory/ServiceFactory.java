package com.supremepole.springinstancefactory;

public class ServiceFactory {

    public WebsiteServiceImpl createWebsiteService(){
        return new WebsiteServiceImpl();
    }

    public ApplicationServiceImpl createApplicationService(String name){
        return new ApplicationServiceImpl();
    }

}

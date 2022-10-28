package com.supremepole.springconfigbeanxml;

public class UseFunctionService {

    private FunctionService functionService;

    public FunctionService getFunctionService() {
        return functionService;
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }

}

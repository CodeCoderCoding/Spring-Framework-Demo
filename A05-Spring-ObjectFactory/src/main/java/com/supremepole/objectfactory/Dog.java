package com.supremepole.objectfactory;

import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

public class Dog {

    @Value("#{getObject('myMap')}")
    private Map<String, Object> mapInDog;

    public Map<String, Object> getMapInDog() {
        return mapInDog;
    }

    public void setMapInDog(Map<String, Object> mapInDog) {
        this.mapInDog = mapInDog;
    }

}

package com.supremepole.springel.bean;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String nameString;

    public Person(String nameString) {
        this.nameString = nameString;
    }

    public String getName1() {
        return nameString;
    }

    public String getName(){
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

}

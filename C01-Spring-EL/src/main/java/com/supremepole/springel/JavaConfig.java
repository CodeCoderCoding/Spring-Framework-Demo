package com.supremepole.springel;

import com.supremepole.springel.bean.Dog;
import com.supremepole.springel.bean.Person;
import com.supremepole.springel.springel.SpringELBean;
import com.supremepole.springel.springel.SpringELValueNormal;
import com.supremepole.springel.springel.SpringELgetObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.supremepole.springel")
public class JavaConfig {

    @Bean
    public Person person(){
        return new Person("name");
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public SpringELValueNormal springELValueNormal(){
        return new SpringELValueNormal();
    }

    @Bean
    public SpringELBean springELBean(){
        return new SpringELBean();
    }

    @Bean
    public SpringELgetObject springELgetObject(){
        return new SpringELgetObject();
    }

}

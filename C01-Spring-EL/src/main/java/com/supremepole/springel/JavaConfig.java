package com.supremepole.springel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.supremepole.springel")
public class JavaConfig {

    @Bean(name="person")
    public Person person(){
        return new Person("name");
    }

    @Bean
    public SpringEL springEL(){
        return new SpringEL();
    }

}

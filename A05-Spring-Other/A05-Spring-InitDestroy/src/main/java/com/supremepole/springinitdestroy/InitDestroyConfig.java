package com.supremepole.springinitdestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author CodeCoderCoding
 */
@Configuration
@ComponentScan("com.supremepole.springinitdestroy")
public class InitDestroyConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanJavaConfig beanJavaConfig(){
        return new BeanJavaConfig();
    }
    @Bean
    BeanAnnotation beanAnnotation(){
        return new BeanAnnotation();
    }
}

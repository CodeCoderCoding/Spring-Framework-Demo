package com.supremepole.springinterceptor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author CodeCoderCoding
 */
@Configuration
@ComponentScan("com.supremepole.springinterceptor")
@EnableAspectJAutoProxy
public class AopConfig {

}
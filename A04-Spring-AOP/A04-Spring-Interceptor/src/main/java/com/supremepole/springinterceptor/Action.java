package com.supremepole.springinterceptor;

import java.lang.annotation.*;

/**
 * @author CodeCoderCoding
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}

package com.supremepole.springinitdestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringInitDestroy {
    @SuppressWarnings("unused")
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitDestroyConfig.class);
        BeanJavaConfig beanJavaConfig = context.getBean(BeanJavaConfig.class);
        BeanAnnotation beanAnnotation = context.getBean(BeanAnnotation.class);
        context.close();
    }
}

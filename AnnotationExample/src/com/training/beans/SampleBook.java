package com.training.beans;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SampleBook {

    long id() default 100;
    String name() default "Sample Book";
    double price() default 0.0;

}

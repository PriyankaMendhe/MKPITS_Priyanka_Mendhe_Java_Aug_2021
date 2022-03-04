package com.example.springaspect5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect7 {

    @Before("execution(public * get*())")
    public void beforeAdvice1()
    {
        System.out.println("Before target method 1");

    }

    @Before("execution(public * get*())")
    public void beforeAdvice2()
    {
        System.out.println("before target method 2");

    }
}

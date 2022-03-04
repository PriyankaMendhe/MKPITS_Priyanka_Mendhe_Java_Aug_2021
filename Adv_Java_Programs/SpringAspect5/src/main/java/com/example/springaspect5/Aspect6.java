package com.example.springaspect5;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aspect6 {

    @Before("execution(public void getterM())")
    public void beforeAdvice()
    {
        System.out.println("Before target method");

    }

    @After("execution(public void getterM())")
    public void afterAdvice()
    {
        System.out.println("After target method");

    }

    @Pointcut("execution(public int getId())")
    public void getterM(){}
}

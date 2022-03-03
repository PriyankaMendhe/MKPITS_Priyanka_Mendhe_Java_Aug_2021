package com.example.springaspect2;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect1 {

    @Before("execution(public int getId())")
    public  void beforeAdvice()
    {
        System.out.println("Before");

    }

    @After("execution(public int getId())")
    public void afterAdvice()
    {
        System.out.println("After");


    }
}

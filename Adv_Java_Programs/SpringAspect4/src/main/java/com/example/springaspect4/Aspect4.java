package com.example.springaspect4;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect4 {



    //@Before("execution(public int get*())")//will call both class all  getter method of type int
    //@Before("execution(public int getId())")//will call both class getID method
    // @Before("execution(public * get*())")//will call both class all  getter method of any type
    @Before("execution(public * set*(..))")
    public void beforeAdvice()
    {
        System.out.println("before Target called");

    }

    @After("execution(public int getId())")
    public void afterAdvice()
    {

        System.out.println("After Target called");
    }
}

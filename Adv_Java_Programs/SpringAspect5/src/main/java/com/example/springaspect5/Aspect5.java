package com.example.springaspect5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect5 {

//    @Before("execution(public * setId(..))")//set id call and all setID in main class
//    public void beforeAdvice()
//    {
//        System.out.println("before target method");
//
//    }
    @Before("execution(public int com.example.springaspect5.emp.getId())")//fully qualified name to acces specified class getID call of emp class
    public void beforeAdvice()
    {

        System.out.println("Before target method");
    }

    ////fully qualified name to acces specified class getName method of stud class
    @After("execution( public String com.example.springaspect5.stud.getName())")
    public void afterAdvice()
    {
        System.out.println("After target method");

    }
}

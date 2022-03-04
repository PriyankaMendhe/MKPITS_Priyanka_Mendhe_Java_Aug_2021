package com.example.springaspect5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect9 {


    @Before("execution(public * get*())")
    public void beforeAdvice(JoinPoint point)
    {
        System.out.println("BeforeAdvice: "+point.toString());

    }

    @AfterThrowing("execution(public void printThowsException())")
    public void exceptionAdvice(JoinPoint p1)
    {

        System.out.println("ExceptionAdvice: "+p1.toString());
    }

}

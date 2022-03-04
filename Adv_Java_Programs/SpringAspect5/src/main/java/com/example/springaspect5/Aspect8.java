package com.example.springaspect5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect8 {

    @Before("execution(public * get*())")
    public void beforeAdvice(JoinPoint point)
    {
        System.out.println("before: "+point.toString());//Specifying which method of which class is called

        //check this
//        if(point instanceof emp)
//        {
//            emp e2 = (emp) point.getTarget();
//            System.out.println(e2.getName());
//        }
//        if(point instanceof stud)
//        {
//            stud s2 = (stud)point.getTarget();
//            System.out.println(s2.getName());
//        }


    }

//    @After("execution(public * get*())")
//    public void afterAdvice()
//    {
//        System.out.println("after Target Method ");
//    }

}

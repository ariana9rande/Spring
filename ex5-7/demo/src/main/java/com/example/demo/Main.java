package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        OperatorBean operator1 = (OperatorBean)ctx.getBean("operatorBean");
        OperatorBean operator2 = (OperatorBean)ctx.getBean("operatorBean");
        System.out.println("The result is "+ operator1.calc());
        System.out.println("op1:"+operator1+", op2:"+operator2);
    }
}

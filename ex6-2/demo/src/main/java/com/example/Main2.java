package com.example;

import com.example.demo.Greeter;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2
{
    public static void main(String[] args)
    {
        GenericXmlApplicationContext ctx = new
                GenericXmlApplicationContext("classpath*:applicationContext.xml");
        Greeter g1 = (Greeter) ctx.getBean("greeter");
        Greeter g2 = (Greeter) ctx.getBean("greeter");
        System.out.println("(g1==g2)=" + (g1 == g2));
        ctx.close();
    }
}
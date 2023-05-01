package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.example.demo"})
public class JavaConfig
{
    @Bean
    @Scope("prototype")
    public OperatorBean operatorBean()
    {
        return new MinusOp();
        //OperatorBean operator = new MinusOp();
        //operator.setOperand1(op1());
        //operator.setOperand2(op2());
        //return operator;
    }
}

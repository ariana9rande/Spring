package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MinusOp implements OperatorBean
{
    Operand operand1;
    Operand operand2;

    public Operand getOperand1()
    {
        return operand1;
    }

    @Autowired
    public void setOperand1(Operand operand1)
    {
        this.operand1 = operand1;
    }

    public Operand getOperand2()
    {
        return operand2;
    }

    @Autowired
    public void setOperand2(Operand operand2)
    {
        this.operand2 = operand2;
    }

    public int calc()
    {
        return operand1.getValue() - operand2.getValue();
    }
}

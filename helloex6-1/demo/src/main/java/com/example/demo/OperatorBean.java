package com.example.demo;

public interface OperatorBean
{
    int calc();
    void setOperand1(Operand op);
    void setOperand2(Operand op);
    Operand getOperand1();
    Operand getOperand2();
}

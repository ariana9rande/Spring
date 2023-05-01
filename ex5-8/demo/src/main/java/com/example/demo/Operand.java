package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Operand
{
    int value;
    public void Operand()
    {
        value = 10;
    }
    public int getValue()
    {
        return value;
    }
    public void setValue(int v)
    {
        value = v;
    }
}

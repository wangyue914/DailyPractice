package com.designpattern.SimpleFactory;

public class OperationMul extends Operation {
    @Override
    public double Getresult() {
        return getNum1()*getNum2();
    }
}

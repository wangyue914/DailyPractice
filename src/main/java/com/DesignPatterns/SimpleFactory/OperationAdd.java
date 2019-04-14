package com.DesignPatterns.SimpleFactory;

public class OperationAdd extends Operation {
    @Override
    public double Getresult() {
        return getNum1()+getNum2();
    }
}

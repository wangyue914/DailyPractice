package com.designpattern.SimpleFactory;

public class OperationDiv extends Operation {
    @Override
    public double Getresult() {
        return getNum1()/getNum2();
    }
}

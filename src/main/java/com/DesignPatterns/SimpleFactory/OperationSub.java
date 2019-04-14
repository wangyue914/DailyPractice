package com.DesignPatterns.SimpleFactory;

public class OperationSub extends Operation {
    @Override
    public double Getresult() {
        return getNum1()-getNum2();
    }
}

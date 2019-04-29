/**
 * 抽象类  Operation,其他具体计算类继承于他，通过工厂类统一决定实例化为哪一个具体类
 */
package com.designpattern.SimpleFactory;

public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation ope=null;
        switch (operate) {
            case "+":
                ope = new OperationAdd();
                break;
            case "-":
                ope = new OperationSub();
                break;
            case "*":
                ope = new OperationMul();
                break;
            case "/":
                ope = new OperationDiv();
                break;
        }
        return ope;

    }

    public static void main(String[] args) {

        //实际上应该实例化一个单例作为工厂类，这里为了测试直接在工厂类里调用方法
        Operation ope=createOperation("+");
        ope.setNum1(1);
        ope.setNum2(2);
        System.out.println(ope.Getresult());
    }
}

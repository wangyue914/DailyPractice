package com.proxy.jdkproxy;

/**
 * @author wangyue
 * @date 2019/4/29 15:13
 **/
public class testForProxt {
    public static void main(String[] args) {
        LogInvocationHandler logInvocationHandler = new LogInvocationHandler();

        logInvocationHandler.testForProxy();
    }
}

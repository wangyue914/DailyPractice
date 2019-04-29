package com.proxy.jdkproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * JDK 动态代理
 * @author wangyue
 * @date 2019/4/29 15:01
 **/
public class LogInvocationHandler implements InvocationHandler {

    private final static Logger logger = LoggerFactory.getLogger(LogInvocationHandler.class);

    private Hello hello;

    public LogInvocationHandler(){}
    public LogInvocationHandler(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("sayHello".equals(method.getName())) {

            logger.info("you said :" + Arrays.toString(args));
        }
        return method.invoke(hello, args);
    }

    public void testForProxy() {
        Hello hello = (Hello) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{Hello.class},
                new LogInvocationHandler(new HelloImpl()));

        System.out.println(hello.sayHello("I am proxy"));
    }

}

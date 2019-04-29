package com.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author wangyue
 * @date 2019/4/29 17:41
 **/
public class testForCGLIB {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloConcrete.class);
        enhancer.setCallback(new MyMethodInterceptor());

        HelloConcrete helloConcrete = (HelloConcrete) enhancer.create();
        System.out.println(helloConcrete.sayHello("this is cglib"));
    }
}

package com.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author wangyue
 * @date 2019/4/29 17:36
 **/
public class MyMethodInterceptor implements MethodInterceptor {

    private static Logger logger = LoggerFactory.getLogger(MyMethodInterceptor.class);

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        logger.info("you said: " + Arrays.toString(objects));
        return methodProxy.invokeSuper(o, objects);
    }


}

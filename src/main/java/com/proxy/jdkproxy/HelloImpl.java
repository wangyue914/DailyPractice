package com.proxy.jdkproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wangyue
 * @date 2019/2/27 17:07
 **/
public class HelloImpl implements Hello {
    private final static Logger logger = LoggerFactory.getLogger(HelloImpl.class);


    @Override
    public String sayHello(String str) {
        return "helloImpl" + str;
    }
}

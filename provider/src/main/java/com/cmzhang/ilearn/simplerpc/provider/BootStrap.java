package com.cmzhang.ilearn.simplerpc.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cmzhang on 12/14/17.
 */
public class BootStrap {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath*:config/spring-zk-rpc-server.xml");
    }
}

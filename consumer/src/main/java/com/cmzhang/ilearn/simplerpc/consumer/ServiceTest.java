package com.cmzhang.ilearn.simplerpc.consumer;

import com.cmzhang.ilearn.simplerpc.client.RpcProxy;
import com.cmzhang.ilearn.simplerpc.share.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cmzhang on 12/14/17.
 */
public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("classpath*:config/spring-zk-rpc-client.xml");

        RpcProxy rpcProxy = (RpcProxy)ap.getBean("rpcProxy");
        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello("World");
        System.out.println(result);
    }
}

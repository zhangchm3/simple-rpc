package com.cmzhang.ilearn.simplerpc.provider;

import com.cmzhang.ilearn.simplerpc.common.RpcService;
import com.cmzhang.ilearn.simplerpc.share.HelloService;

/**
 * Created by cmzhang on 12/13/17.
 */
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello! " + name;
    }
}

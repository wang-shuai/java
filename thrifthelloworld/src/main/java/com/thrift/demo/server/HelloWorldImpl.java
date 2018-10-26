package com.thrift.demo.server;

import com.thrift.demo.HelloWorldService;
import org.apache.thrift.TException;

public class HelloWorldImpl implements HelloWorldService.Iface {
    @Override
    public String sayHello(String username) throws TException {
        return "hi," + username + " welcome to thrift world";
    }
}

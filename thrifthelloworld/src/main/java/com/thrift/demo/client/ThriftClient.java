package com.thrift.demo.client;

import com.thrift.demo.HelloWorldService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ThriftClient {
    public static void main(String [] args){
        try{
//            TTransport transport = new TFramedTransport(new TSocket("127.0.0.1",50052,5000));
            TTransport transport = new TFramedTransport(new TSocket("192.168.156.247",50052,5000));
            TProtocol protocol = new TBinaryProtocol(transport);
            HelloWorldService.Client client = new HelloWorldService.Client(protocol);
            transport.open();
            String str = client.sayHello("shine");
            System.out.println(str);
            transport.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

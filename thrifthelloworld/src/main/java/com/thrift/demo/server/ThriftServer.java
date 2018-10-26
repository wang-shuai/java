package com.thrift.demo.server;

import com.thrift.demo.HelloWorldService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TFastFramedTransport;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportFactory;

public class ThriftServer {
    public static void main(String [] args){
        ThriftServer server = new ThriftServer();
        server.startServer();
    }

    public void startServer(){
        try {
            System.out.println("start thrift server");
            TProcessor processor = new HelloWorldService.Processor<HelloWorldService.Iface>(new HelloWorldImpl());
            TServerSocket serverTransport = new TServerSocket(50052);
            TTransportFactory transportFactory = new TFastFramedTransport.Factory();
//            TBinaryProtocol.Factory
            TProtocolFactory factory = new TBinaryProtocol.Factory();

            TThreadPoolServer.Args targs = new TThreadPoolServer.Args(serverTransport);
            targs.protocolFactory(factory);
            targs.transportFactory(transportFactory);
            targs.processor(processor);

            TServer server = new TThreadPoolServer(targs);
            server.serve();
        }catch (Exception e){
            System.out.println("start thrift server err");
            e.printStackTrace();
        }
    }
}

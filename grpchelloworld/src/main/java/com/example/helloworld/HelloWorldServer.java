package com.example.helloworld;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


import java.io.IOException;

public class HelloWorldServer {
    private int port = 50051;
    private Server server;

    private void start() throws IOException{
        server = ServerBuilder.forPort(port)
                .addService(new GreeterImpl())
                .build()
                .start();
        System.out.println("service start");

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                System.err.println("*** shutting down gRPC server since JVM is shutting down ***");
                HelloWorldServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if(server !=null){
            server.shutdown();
        }
    }

    private void blockUntilShutidown() throws InterruptedException{
        if (server!=null){
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException,InterruptedException{
        final HelloWorldServer server = new HelloWorldServer();
        server.start();
        server.blockUntilShutidown();

    }

    private class GreeterImpl extends GreeterGrpc.GreeterImplBase{
        @Override
        public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver){
            System.out.println("service:" + req.getName());
            HelloReply reply = HelloReply.newBuilder().setMessage("hello:" + req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }
}

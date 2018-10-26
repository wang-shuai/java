package com.example.helloworld;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class HelloWorldClient {
    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub; //阻塞/同步存根
    private final GreeterGrpc.GreeterStub asyncStub; //非阻塞,异步存根

    public HelloWorldClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext().build();
        blockingStub = GreeterGrpc.newBlockingStub(channel);
        asyncStub = GreeterGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void greet(String name) {
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        System.out.println(channel.getState(true));
        HelloReply response = blockingStub.sayHello(request);
        System.out.println(response.getMessage());

//        StreamObserver<HelloReply> res = new StreamObserver<HelloReply>() {
//            public void onNext(HelloReply helloReply) {
//                System.out.println(helloReply.getMessage());
//            }
//
//            public void onError(Throwable throwable) {
//
//            }
//
//            public void onCompleted() {
//
//            }
//        };
//        asyncStub.sayHello(request,res);
    }

//    public static void main(String[] args) throws InterruptedException {
//        HelloWorldClient client = new HelloWorldClient("127.0.0.1", 50051);
//        for (int i = 0; i < 5; i++) {
//            client.greet("world:" + i);
//        }
//    }
}

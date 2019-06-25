package com.test.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangshuai on 2019/6/25.
 */
public class ThreadPoolTest implements Runnable{
    int sec;
    String name;
    public ThreadPoolTest(int sec,String name){
        this.sec = sec;
        this.name = name;
    }

    public void run() {
        try {
            System.out.println(name + " sleeps " + sec +"s" + Thread.currentThread().getName());
            Thread.sleep(sec*1000);
            System.out.println(name + " awakes");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(2);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                1,2,1L, TimeUnit.SECONDS,workQueue
        );

        poolExecutor.execute(new ThreadPoolTest(15,"jack"));
        poolExecutor.execute(new ThreadPoolTest(1,"mark"));
        poolExecutor.execute(new ThreadPoolTest(1,"june"));
        poolExecutor.execute(new ThreadPoolTest(1,"bill"));
        Thread.sleep(1100);
        poolExecutor.execute(new ThreadPoolTest(1,"james"));
        Thread.sleep(1100);
        poolExecutor.execute(new ThreadPoolTest(1,"white"));
        Thread.sleep(1100);
        poolExecutor.execute(new ThreadPoolTest(1,"jordan"));

        Thread.sleep(2000);

        poolExecutor.shutdown();
    }


}

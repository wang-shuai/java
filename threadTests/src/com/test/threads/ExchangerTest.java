package com.test.threads;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangshuai on 2019/6/25.
 */
public class ExchangerTest {
    public static class Producer implements Runnable{
        Exchanger<Integer> exchanger;
        public Producer(Exchanger<Integer> exchanger){
            this.exchanger = exchanger;
        }
        public void run() {
            for(int i=1;i<10;i++){
                try {
                    int j = i;
                    System.out.println("producer before exchange :" + j);
                    j = exchanger.exchange(i);
                    System.out.println("producer after exchange :" + j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Consumer implements Runnable{
        Exchanger<Integer> exchanger;
        public Consumer(Exchanger<Integer> exchanger){
            this.exchanger = exchanger;
        }
        public void run() {
            for(;;){
                try {
                    int j = 100;
                    System.out.println("consumer before exchange :" + j);
                    j = exchanger.exchange(j);
                    System.out.println("consumer after exchange :" + j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Exchanger<Integer> exchanger = new Exchanger<Integer>();

        new Thread(new ExchangerTest.Producer(exchanger)).start();
        new Thread(new ExchangerTest.Consumer(exchanger)).start();

        TimeUnit.SECONDS.sleep(5);
        System.exit(1);
    }
}

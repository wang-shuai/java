package com.test.threads;

import java.util.concurrent.*;

/**
 * Created by wangshuai on 2019/6/25.
 */
public class CountDownLatchTest implements Runnable {

    private CountDownLatch latch = null;

    public CountDownLatchTest(CountDownLatch latch) {
        this.latch = latch;
    }

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(30);
        ExecutorService executorService = new ThreadPoolExecutor(
                3,
                10,
                2L,
                TimeUnit.SECONDS,
                queue);

        executorService.execute(new CountDownLatchTest(latch));
        executorService.execute(new CountDownLatchTest(latch));
        executorService.execute(new CountDownLatchTest(latch));

        try {
            System.out.println("main thread is waitting " + latch.getCount());
            latch.await();
            System.out.println("all thread executed " + latch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        System.exit(3);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
    }
}

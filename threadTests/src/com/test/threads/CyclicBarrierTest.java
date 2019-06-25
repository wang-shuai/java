package com.test.threads;

import java.util.concurrent.*;

/**
 * Created by wangshuai on 2019/6/25.
 */
public class CyclicBarrierTest implements Runnable {

    int index =0;
    private CyclicBarrier next = null;
    private CyclicBarrier start = null;

    public CyclicBarrierTest(int index,CyclicBarrier start,CyclicBarrier next) {
        this.index =index;
        this.next = next;
        this.start = start;
    }

    public static void main(String[] args) {
        CyclicBarrier barrier12 = new CyclicBarrier(2);
        CyclicBarrier barrier23 = new CyclicBarrier(2);
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(30);
        ExecutorService executorService = new ThreadPoolExecutor(
                3,
                10,
                2L,
                TimeUnit.SECONDS,
                queue);

        //按序执行，第三个需要等待第二个资源，第二个需要等第一个资源
        executorService.execute(new CyclicBarrierTest(1,null,barrier12));
        executorService.execute(new CyclicBarrierTest(2,barrier12,barrier23));
        executorService.execute(new CyclicBarrierTest(3,barrier23,null));

        System.out.println("按顺序执行完毕");
//        System.exit(0);
        executorService.shutdown();
    }

    public void run() {
        await(start);

        try {
            Thread.sleep(2000);
            System.out.println(index + " is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        await(next);
    }

    private void await(CyclicBarrier barrier){
        if(barrier!=null){
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}

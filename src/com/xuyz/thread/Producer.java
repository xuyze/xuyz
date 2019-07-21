package com.xuyz.thread;

import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 功能描述：
 *
 * @version 1.0.0
 * @author: <a href="12510705@qq.com">Zeny</a>
 * @Date: Created in 2018/6/26 23:23.
 */
public class Producer implements Runnable {
    private volatile boolean isRunning = true;
    private BlockingDeque<PCData> queue;
    private static AtomicInteger count = new AtomicInteger();
    private static final int SELEEPTIME = 1000;

    public Producer(BlockingDeque<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        PCData data = null;
        Random r = new Random();
        try {
            while (isRunning) {
                Thread.sleep(r.nextInt(SELEEPTIME));
                data = new PCData(count.decrementAndGet());
                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public void stop() {
        isRunning = false;
    }
}

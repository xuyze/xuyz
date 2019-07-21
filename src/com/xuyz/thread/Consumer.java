package com.xuyz.thread;

import java.util.Random;
import java.util.concurrent.BlockingDeque;

/**
 * 功能描述：
 *
 * @version 1.0.0
 * @author: <a href="12510705@qq.com">Zeny</a>
 * @Date: Created in 2018/6/26 23:43.
 */
public class Consumer implements Runnable {
    private BlockingDeque<PCData> queue;
    private static final int SLEEPTIME = 1000;

    public Consumer(BlockingDeque<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random r = new Random();
        try {
            while (true) {
                PCData data = queue.take();
                int re = data.getIntData() * data.getIntData();
                Thread.sleep(r.nextInt(SLEEPTIME));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: WaitTest
 * Author:   xuyz
 * Date:     2018/10/4 00:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.thread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xuyz
 * @create 2018/10/4
 * @since 1.0.0
 */
public class WaitTest {
    public static void main(String[] args) {

        ThreadA t1 = new ThreadA("t1");

        synchronized(t1) {
            try {
                // 启动“线程t1”
                System.out.println(Thread.currentThread().getName()+" start t1");
                t1.start();

                // 主线程等待t1通过notify()唤醒。
                System.out.println(Thread.currentThread().getName()+" wait()");
                t1.wait();

                System.out.println(Thread.currentThread().getName()+" continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

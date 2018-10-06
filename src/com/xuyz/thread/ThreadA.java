/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ThreadA
 * Author:   xuyz
 * Date:     2018/10/4 00:17
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.thread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author xuyz
 * @create 2018/10/4
 * @since 1.0.0
 */
public class ThreadA extends Thread {

    public ThreadA(String name) {
        super(name);
    }

    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()+" call notify()");
            // 唤醒当前的wait线程
            notify();
        }
    }
}

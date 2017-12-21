package com.xuyz.thread;

/**
 * 功能描述：
 *
 * @version 1.0.0
 * @author: <a href="12510705@qq.com">Zeny</a>
 * @Date: Created in 2017/12/2 11:57.
 */
public class TestThread {

    public static void main(String[] args){
        System.out.println("222222"+Thread.currentThread().getName());
        Helper helper = new Helper("sssssssss");
        Thread thread = new Thread(helper);
        thread.setName("a-worker-thread");
        thread.start();
    }

    static class Helper implements Runnable{
        private final String message;

        public Helper(String message){
            this.message = message;
        }

        private void doSomething(String messgae){
            System.out.println("11111"+Thread.currentThread().getName());
            System.out.println("do something with" + message);
        }

        @Override
        public void run(){
            doSomething(message);
        }
    }
}

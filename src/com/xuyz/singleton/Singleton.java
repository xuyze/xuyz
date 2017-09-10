package com.xuyz.singleton;

/**
 * Created by wang on 2017/3/20.
 */
public class Singleton {

    private Singleton(){
    }

    private static volatile Singleton instance=null;

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class) {
                if(instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

package com.xuyz.singleton;

/**
 * Created by wang on 2017/3/20.
 */
public class Singleton1 {

    private Singleton1(){

    }

    private static Singleton1 instance;

    public static Singleton1 getInstance(){
        if(instance==null){
            instance = new Singleton1();
        }
        return instance;
    }
}

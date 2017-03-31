package com.xuyz.singleton;

/**
 * Created by wang on 2017/3/20.
 */

/**
 * 单例模式
 * 应用场合：有些对象只需要一个就足够了
 * 作用：保证整个应用程序中某个实例有且只有一个
 */
public class Singleton {

    private Singleton(){

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}

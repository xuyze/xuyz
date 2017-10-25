package com.xuyz.proxy;

/**
 * 功能描述：
 *
 * @version 1.0.0
 * @author: <a href="12510705@qq.com">Zeny</a>
 * @Date: Created in 2017/9/17 16:27.
 */
public class Main {

    public static void main(String[] args){
        IDBQuery idbQuery = new DBQueryProxy();
        idbQuery.request();
        System.out.println(idbQuery.request());
    }
}

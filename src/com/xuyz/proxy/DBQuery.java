package com.xuyz.proxy;

/**
 * 功能描述：
 *
 * @version 1.0.0
 * @author: <a href="12510705@qq.com">Zeny</a>
 * @Date: Created in 2017/9/17 16:21.
 */
public class DBQuery implements IDBQuery {

    public DBQuery(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String request(){
        return "request string";
    }
}

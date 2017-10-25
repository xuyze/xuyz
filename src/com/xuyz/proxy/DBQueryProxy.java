package com.xuyz.proxy;

/**
 * 功能描述：
 *
 * @version 1.0.0
 * @author: <a href="12510705@qq.com">Zeny</a>
 * @Date: Created in 2017/9/17 16:25.
 */
public class DBQueryProxy implements IDBQuery {
    private DBQuery dbQuery= null;
    public String request(){
        if(dbQuery==null){
            dbQuery=new DBQuery();
        }
        return dbQuery.request();
    }
}

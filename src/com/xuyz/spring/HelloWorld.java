package com.xuyz.spring;

/**
 * 功能描述：
 *
 * @version 1.0.0
 * @author: <a href="12510705@qq.com">Zeny</a>
 * @Date: Created in 2018/4/8 23:07.
 */
public class HelloWorld {

    private String message;

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

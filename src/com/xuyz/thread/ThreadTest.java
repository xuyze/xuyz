/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ThreadTest
 * Author:   xuyz
 * Date:     2019/7/21 16:18
 * Description: 实现线程方式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.thread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现线程方式〉
 *
 * @author xuyz
 * @date 2019/7/21
 * @since 1.0.0
 */
public class ThreadTest extends Thread {

    @Override
    public void run(){
        System.out.println("开启线程");
    }
}

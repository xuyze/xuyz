/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Thread2
 * Author:   xuyz
 * Date:     2019/7/21 16:25
 * Description: 线程实现方式2
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.thread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈线程实现方式2〉
 *
 * @author xuyz
 * @date 2019/7/21
 * @since 1.0.0
 */
public class Thread2 implements Runnable {

    @Override
    public void run(){
        System.out.println("线程开启");
    }
}

/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestExecutor
 * Author:   xuyz
 * Date:     2019/7/21 16:43
 * Description: 线程池例子
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 〈一句话功能简述〉<br> 
 * 〈线程池例子〉
 *
 * @author xuyz
 * @date 2019/7/21
 * @since 1.0.0
 */
public class TestExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("运行线程池");
            }
        });
    }
}

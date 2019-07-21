/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   xuyz
 * Date:     2019/7/21 16:21
 * Description: main方法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.thread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈main方法〉
 *
 * @author xuyz
 * @date 2019/7/21
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        Thread tt = new Thread(thread2);
        tt.start();
    }
}

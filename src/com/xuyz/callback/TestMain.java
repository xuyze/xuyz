/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestMain
 * Author:   xuyz
 * Date:     2019/6/12 23:44
 * Description: main函数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.callback;

/**
 * 〈一句话功能简述〉<br> 
 * 〈main函数〉
 *
 * @author xuyz
 * @create 2019/6/12
 * @since 1.0.0
 */
public class TestMain {

    public static void main(String[] args) {
        TestCallBack testCallBack = new TestCallBack();
        testCallBack.testA(new Test() {
            @Override
            public void testDemo() {
                System.out.println("测试");
            }
        });
    }
}

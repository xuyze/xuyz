/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestMethod
 * Author:   xuyz
 * Date:     2019/1/1 09:19
 * Description: 方法句柄学习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.methodhandler;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br> 
 * 〈方法句柄学习〉
 *
 * @author xuyz
 * @create 2019/1/1
 * @since 1.0.0
 */
public class TestMethod {

    public static void main(String[] args){
        MethodType mt = MethodType.methodType(Car.class);

        System.out.println("类型："+mt);

        try {
            Method[] mh = MethodHandle.class.getDeclaredMethods();
            for (int i= 0; i<mh.length;i++){
                System.out.println(mh[i]);
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

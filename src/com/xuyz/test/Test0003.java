/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Test0003
 * Author:   xuyz
 * Date:     2018/12/5 23:47
 * Description: 类加载器调试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.test;

import java.util.Collections;

/**
 * 〈一句话功能简述〉<br> 
 * 〈类加载器调试〉
 *
 * @author xuyz
 * @create 2018/12/5
 * @since 1.0.0
 */
public class Test0003 {

    public static void main(String[] args) {
        ClassLoader cl = Test0003.class.getClassLoader();
        // AppClassLoader的父加载器是ExtClassLoader
        System.out.println("ClassLoader is:"+cl.toString());
        System.out.println("ClassLoader\'s parent is:"+cl.getParent().toString());
        //System.out.println("ClassLoader\'s grand father is:"+cl.getParent().getParent().toString());
    }
}

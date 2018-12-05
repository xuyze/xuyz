/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MapTest
 * Author:   xuyz
 * Date:     2018/10/18 23:55
 * Description: Map遍历测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Map遍历测试〉
 *
 * @author xuyz
 * @create 2018/10/18
 * @since 1.0.0
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("11","111");
        map.forEach((key,value)->{
            System.out.println("key=" + key + " value=" + value);
        });
        for(Map.Entry m : map.entrySet()){
            System.out.println("key=" + m.getKey() + " value=" + m.getValue());
        }
    }
}

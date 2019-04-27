/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test203
 * Author:   xuyz
 * Date:     2019/3/10 15:06
 * Description: LeetCode-203
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.leetcode;

/**
 * 〈一句话功能简述〉<br> 
 * 〈LeetCode-203〉
 *
 * @author xuyz
 * @create 2019/3/10
 * @since 1.0.0
 */
public class Test203 {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode cur = header;
        while(cur.next != null){
            if(cur.next.val == val ){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return header.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(-1);
        listNode.next = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next = new ListNode(3);
        //System.out.println(listNode);
        removeElements(listNode,2);
        while (listNode.next != null){
            System.out.println(listNode.val);
        }
    }
}

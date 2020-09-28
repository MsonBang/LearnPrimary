package com.mxb.learn.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author miaoxuebing
 * @Description: TODO[测试学习linkedList集合]
 * @date 2020/6/23 7:46 下午
 */
public class TestLinkedList {

    /**
     * @Description: TODO[For循环测试输出]
     * @Params: [list]
     * @Return: void
     * @Author: miaoxuebing
     * @Date: 2020/6/23 7:54 下午
     **/
    public static void LoopFor(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("下标为" + i + "的值为：" + str);
        }
    }

    /**
     * @Description: TODO[Foreach循环进行遍历输出]
     * @Params: [list]
     * @Return: void
     * @Author: miaoxuebing
     * @Date: 2020/6/23 8:28 下午
     **/
    public static void LoopForeach(List<String> list) {
        for (String str : list) {
            System.out.println("LinkedList打印------" + str);
        }
    }

    /**
     * @Description: TODO[Iterator]
     * @Params: [list]
     * @Return: void
     * @Author: miaoxuebing
     * @Date: 2020/6/23 8:34 下午
     **/
    public static void LoopIterator(List<String> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator遍历结果为：" + iterator.next());
        }
    }


    /**
     * @Description: TODO[测试Main方法]
     * @Params: [args]
     * @Return: void
     * @Author: miaoxuebing
     * @Date: 2020/6/23 7:50 下午
     **/
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ccc");
        linkedList.add("ccc");

        //开始调用for循环
        //LoopFor(linkedList);
        //开始调用Foreach循环
        //LoopForeach(linkedList);
        //开始迭代器循环
        LoopIterator(linkedList);

    }
}

package com.mxb.learn.colleciton.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author miaoxuebing
 * @Description: TODO[测试ArrayList常用方法，学习常用技巧]
 * @date 2020/6/19 11:24 上午
 */
public class TestArrayList {


    /**
    * @Description: TODO[list遍历之For]
    * @Params: [List]
    * @Return: void
    * @Author: miaoxuebing
    * @Date: 2020/6/19 3:18 下午
    **/
    public static void LoopThroughFor(List<String> Arraylist){
        //第一种就是最简单的for循环，进行list一个遍历，也是初级开发常用到的
        //为什要删除的时候让i--呢，因为，如果i不变的话，第一次i为0，下标0123我们删除下标为0的 ，
        //现在剩三个了，下标重新变为012，这时候我们i变为了1，导致我们删除012，删除的是下标为1的，不是0的
        //i--其实就是每次让list.remove掉第一个数，也就是每次remove(0)的数，最后全部清空这个list
        for (int i = 0; i < Arraylist.size(); i++) {
            String Str = Arraylist.get(i);
            System.out.println("for循环遍历，下标为"+i+",数据为"+Str);
            System.out.println(Arraylist.remove(i--));
        }
        System.out.println(Arraylist);
    }

    /**
    * @Description: TODO[list遍历之Foreach]
    * @Params: [Arraylist]
    * @Return: void
    * @Author: miaoxuebing
    * @Date: 2020/6/19 3:50 下午
    **/
    public static void LoopThroughForeach(List<String> Arraylist){
        for (String str: Arraylist) {
            System.out.println("foreach循环数据为："+str);
            if("cat".equals(str)){
                Arraylist.remove(str);
            }else if("dog".equals(str)){
                Arraylist.remove(str);
            }
        }
    }

    /**
    * @Description: TODO[list遍历之Iterator]
    * @Params: [Arraylist]
    * @Return: void
    * @Author: miaoxuebing
    * @Date: 2020/6/19 5:32 下午
    **/
    public static void LoopTroughForeachIterator(List<String> Arraylist){
        Iterator<String> iterator = Arraylist.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if("cat".equals(str)){
                iterator.remove();
            }else if("dog".equals(str)){
                iterator.remove();
            }
        }
    }



    /**
    * @Description: TODO[mian函数]
    * @Params: [args]
    * @Return: void
    * @Author: miaoxuebing
    * @Date: 2020/6/19 3:30 下午
    **/
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("pig");
        list.add("monkey");

        //普通for循环
        //LoopThroughFor(list);
        //foreach循环
        //LoopThroughForeach(list);
        //Iteratro循环
        LoopTroughForeachIterator(list);
    }

}

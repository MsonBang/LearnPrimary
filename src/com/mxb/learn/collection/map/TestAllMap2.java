package com.mxb.learn.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author miaoxuebing
 * @Description: TODO[Map遍历的几种方式]
 * @date 2020/9/29 9:50 上午
 */
public class TestAllMap2 {
    //学习map遍历的几种方式：
        //增强for循环遍历
        //迭代器遍历
    //读取的效率比较：
        //增强for循环使用方便，但性能较差，不适合处理超大量级的数据。
        //迭代器的遍历速度要比增强for循环快很多，是增强for循环的2倍左右。
        //使用entrySet遍历的速度要比keySet快很多，是keySet的1.5倍左右

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        //增强for第一种，keyset()遍历
        for (String key : map.keySet()) {
            System.out.println(key + " ：" + map.get(key));
        }

        System.out.println("-------------------------------------------------");

        //增强for第二种，enkeyset()遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ：" + entry.getValue());
        }

        System.out.println("-------------------------------------------------");

        //迭代Iterator第一种，keyset()遍历
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "　：" + map.get(key));
        }

        System.out.println("-------------------------------------------------");

        //迭代Iterator第二种，enkeyset()遍历
        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> entry = iterator2.next();
            System.out.println(entry.getKey() + "　：" + entry.getValue());
        }


    }
}

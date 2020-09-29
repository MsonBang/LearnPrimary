package com.mxb.learn.collection.map;

import java.util.*;

/**
 * @author miaoxuebing
 * @Description: TODO[测试map排序的效率]
 * @date 2020/9/29 10:11 上午
 */
public class TestAllMap3 {

    //HashMap、Hashtable、LinkedHashMap排序比较

    public static void main(String[] args) {
        //1.第一种普通的排序方法：
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "c");
        map.put("b", "b");
        map.put("c", "a");

        // 通过ArrayList构造函数把map.entrySet()转换成list
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
        // 通过比较器实现比较排序
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> mapping1, Map.Entry<String, String> mapping2) {
                return mapping1.getKey().compareTo(mapping2.getKey());
            }
        });
        for (Map.Entry<String, String> mapping : list) {
            System.out.println(mapping.getKey() + " ：" + mapping.getValue());
        }

        System.out.println("------------------------------------------------------------------------");

        //2.第二种treeMap默认升序排血
        Map<String, String> treeMap = new TreeMap<>();
        map.put("b", "c");
        map.put("a", "b");
        map.put("c", "a");
        for (String key : map.keySet()) {
            System.out.println(key + " ：" + map.get(key));
        }

        System.out.println("-----------------------------------------------------------------------");

        //如果想要treeMap降序排血，需要重新写一下排序规则,重写compare方法即可
        Map<String, String> treeMap2 = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String obj1, String obj2) {
                return obj2.compareTo(obj1);// 降序排序
            }
        });
        treeMap2.put("a", "c");
        treeMap2.put("b", "b");
        treeMap2.put("c", "a");
        for (String key : treeMap2.keySet()) {
            System.out.println(key + " ：" + treeMap2.get(key));
        }
    }
}

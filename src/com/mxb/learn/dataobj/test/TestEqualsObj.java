package com.mxb.learn.dataobj.test;

import com.mxb.learn.dataobj.entity.NewUser;
import com.mxb.learn.dataobj.entity.User;

/**
 * className：TestEqualsObj
 * Description：TODO[除了基本数据类型，字符串之外，还有常用obj的对比]
 * Createtime：2020/5/29 17:23
 * author：miaoxuebing
 */
public class TestEqualsObj {

    /**
     * 基本数据类型只能用==进行比较，并且比较基本类型的值
     * 字符串String，==比较两个对象所在的内存地址是否相同，equals()用来比较两个字符串的值是否相同
     * 对象的equals方法，其实就是obj的equals方法，底层还是使用==进行比较内存地址，如果想要比较是否相同个，必须要重写equals方法
    */

    public static void main(String[] args) {

        /**
         *  ==标胶内存地址，显然是两个不同的对象，内存地址不一致
         *  equals比较，如果不重写equals方法，那么底层还是使用==进行比较，还是比较的内存地址
         *  这里的user没有重写equals和hashcode方法
         */
        User user1 = new User();
        User user2 = new User();
        System.out.println(user1 == user2);//false
        System.out.println(user1.equals(user2));//false


        System.out.println("-------------------------------");


        /**
         * 新建两个对象，显然NewUser对象中重写了equals方法，比较的是他们所有的值，userNameh和age相同的时候才认为两个对象相同
         * 所以这里返回为false
        */
        NewUser newUser1 = new NewUser("张无忌","18");
        NewUser newUser2 = new NewUser("梅超风","25");
        System.out.println(newUser1.equals(newUser2));//false


        System.out.println("-------------------------------");


        /**
         * 新建两个对象，显然NewUser对象中重写了equals方法，比较的是他们所有的值，userNameh和age相同的时候才认为两个对象相同
         * 下面连个对象UserName和age都相同，所谓返回true
         */
        NewUser newUser3 = new NewUser("刘德华","55");
        NewUser newUser4 = new NewUser("刘德华","55");
        System.out.println(newUser3.equals(newUser4));//true
    }


}

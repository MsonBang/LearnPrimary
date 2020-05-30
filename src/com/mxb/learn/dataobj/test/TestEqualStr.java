package com.mxb.learn.dataobj.test;

/**
 * className：TestEqual
 * Description：TODO[当前类主要测试java equals()方法和“==”方法的区别]
 * Createtime：2020/5/29 16:51
 * author：miaoxuebing
 */
public class TestEqualStr {

    /**
     * @name: main
     * @description: TODO  [测试比较简单，直接使用main方法进行测试结果]
     * @params: [args]
     * @return: void
     * @date: 2020/5/29 16:54
     * @auther:
     *
    */
    public static void main(String[] args) {

        String s1 = "123";
        String s2 = "123";
        //s1先判断常量池里面有没有123，显然第一次是没有的，所以在常量池创建了一个对象s1
        //s2先去判断常量池是否有123，显然之前已经存在123，所以s2直接这个常量的引用s1.所以内存地址是相同的，所以为true
        //s1.equals(s2),对于字符串来说，equals主要比较包含内容是否相同，很显然s1,s2内容是相同的
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println("---------------------");


        //s3首先是创建了一个新对象，s4也同时新建了一个新的对象，两者的内存地址不同，所有s3==s4，结果为false
        //s3.eauals(s4)，字符串本来equals比较的就是他的内容，所以为true
        String s3 = new String("234");//false
        String s4 = new String("234");//true
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println("---------------------");



        //这个情况和上面一样，s5先去常量池查看是否有345，如果没有就新建一个对象s5， s6是new新建了一个新的对象，所以内存不同，s5==s6为false
        //s5.equals(s6)，要知道字符串就是比较他的内容，所以为true
        String s5 = "345";
        String s6 = new String("345");
        System.out.println(s5==s6);//false
        System.out.println(s5.equals(s6));//true


    }
}

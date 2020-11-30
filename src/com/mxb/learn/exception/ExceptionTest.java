package com.mxb.learn.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @author miaoxuebing
 * @Description: TODO[异常处理测试学习类-基本的测试]
 * @date 2020/11/30 上午11:14
 */
public class ExceptionTest {

    /**
    * @Description: TODO[空指针异常]
    * @Params: []
    * @Return: void
    * @Author: miaoxuebing
    * @Date: 2020/11/30 上午11:16
    **/
    public static void nullExceptiontest() throws MyException {
        String a = null;
        if(a == null){
            throw new MyException("对象为null，请检查");
        }
        System.out.println(a.length());
    }

    /** 超出内存限制异常 */
    public static void outOfMemoryErrorTest(){
        List list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            byte[] bytes = new byte[1024*1024*1024];
            list.add(bytes);
        }
    }

    /**
    * @Description: TODO[捕捉异常，进行处理]
    * @Params:
    * @Return:
    * @Author: miaoxuebing
    * @Date: 2020/11/30 上午11:24
    **/
    public static void trycatchException(){
        try {
            nullExceptiontest();
        }catch (Exception e){
            System.out.println("进入异常处理了1......");
            e.printStackTrace();
        }
    }

    /**
    * @Description: TODO[抛出异常，不在方法内捕捉]
    * @Params:
    * @Return:
    * @Author: miaoxuebing
    * @Date: 2020/11/30 上午11:29
    **/
    public static void throwsExcepton() throws Exception{
        nullExceptiontest();
    }

    /** main方法测试类 */
    public static void main(String[] args) throws MyException {
//        try{
//            nullExceptiontest();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        nullExceptiontest();
        //outOfMemoryErrorTest();
        //trycatchException(); //本方法捕获了异常，直接抛出了
    }



}

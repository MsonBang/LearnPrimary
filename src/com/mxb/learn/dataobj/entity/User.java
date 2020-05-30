package com.mxb.learn.dataobj.entity;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * className：User
 * Description：TODO
 * Createtime：2020/5/30 9:53
 * author：miaoxuebing
 */
public class User {
    private String userName;
    private String age;

    public User() {
    }

    public User(String userName, String age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}

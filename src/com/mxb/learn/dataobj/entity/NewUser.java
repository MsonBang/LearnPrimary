package com.mxb.learn.dataobj.entity;

/**
 * className：User
 * Description：TODO
 * Createtime：2020/5/30 9:53
 * author：miaoxuebing
 */
public class NewUser {
    private String userName;
    private String age;

    public NewUser() {
    }

    public NewUser(String userName, String age) {
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

    @Override
    public String toString() {
        return "userName:"+ this.userName+",age:"+this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }

        if(obj instanceof NewUser){
            NewUser other = (NewUser) obj;
            //这里开始比较两个对象字段值，如果相同则返回相同
            if(equalsStr(this.userName,other.userName) && equalsStr(this.age, other.age)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {

        int result = 17;
        result = 31 * result + (userName==null?0:userName.hashCode());
        result = 31 * result + (age==null?0:age.hashCode());

        return result;
    }
    

    public boolean equalsStr(String str1, String str2){
        if((str1==null && "".equals(str1)) && (str2!=null && "".equals(str2))){
            return true;
        }

        if((str1!=null && !"".equals(str1)) && str1.equals(str2)){
            return true;
        }
        return false;
    }

}

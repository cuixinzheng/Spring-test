package com.cui.dao.impl;

import com.cui.dao.UserDao;
import com.cui.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoimpl implements UserDao {
/*    public UserDaoimpl() {
        System.out.println("UserDaoimpl创建");
    }

    public void init(){
        System.out.println("初始化方法");
    }

    public void destory(){
        System.out.println("销毁方法");
    }*/
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save(){
        System.out.println(username+"====="+age);
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("hello");
    }
}

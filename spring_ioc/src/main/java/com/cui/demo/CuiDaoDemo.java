package com.cui.demo;

import com.cui.dao.CuiDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CuiDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        CuiDao cui = (CuiDao) app.getBean("cui");


        cui.cui();
    }
}

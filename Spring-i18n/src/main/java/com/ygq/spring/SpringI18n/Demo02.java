package com.ygq.spring.SpringI18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class Demo02 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //传递动态参数，使用数组形式对应{0} {1}顺序
        Object[] objects = new Object[] {"ygq", new Date().toString()};

        //www.ygq.com为资源文件的key值
        //objects为资源文件value值所需要的参数,Local.CHINA为国际化为语言
        String str = ac.getMessage("www.ygq.com", objects, Locale.CHINA);
        System.out.println(str);
    }
}

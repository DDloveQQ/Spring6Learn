package com.ygq.spring.ResourceLoaderAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class Demo03 {
    public static void main(String[] args) {
        //Spring容器会将一个ResourceLoader对象作为该方法的参数传入
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        TestBean testBean = ac.getBean("testBean", TestBean.class);

        //获取ResourceLoader对象
        ResourceLoader resourceLoader = testBean.getResourceLoader();
        System.out.println("Spring容器将自身注入到ResourceLoaderAware Bean 中 ？ ：" + (resourceLoader == ac));

        //加载其他资源
        Resource resource = resourceLoader.getResource("ygq.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}

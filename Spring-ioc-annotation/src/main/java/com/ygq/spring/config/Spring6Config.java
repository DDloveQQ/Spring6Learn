package com.ygq.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 标记此文件为配置类,使用此方法进行全注解开发可以省去bean.xml文件
@Configuration
@ComponentScan("com.ygq.spring")
public class Spring6Config {
}

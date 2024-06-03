package com.ygq.spring.AnnoAop;

import org.junit.jupiter.api.Test;

public class testDynamicProxy {
    @Test
    // 测试基于动态代理模式的设计方法
    public void test01() {
        ProxyFactory factory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) factory.getProxy();  // 获取能够调用目标方法的代理对象
        proxy.div(1, 2);  // 使用代理调用方法,而非直接调用目标方法
    }
}

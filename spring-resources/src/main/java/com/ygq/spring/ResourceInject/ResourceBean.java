package com.ygq.spring.ResourceInject;

import org.springframework.core.io.Resource;

// 创建依赖注入类，定义属性和方法
public class ResourceBean {
    private Resource res;

    public void setRes(Resource res) {
        this.res = res;
    }
    public Resource getRes() {
        return res;
    }

    public void parse(){
        System.out.println(res.getFilename());
        System.out.println(res.getDescription());
    }
}

package com.ygq.spring.ByInterface;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

public class TestMethod1 {
    public static void main(String[] args) {
        //创建person对象
        Person person = new Person();
        person.setName("lucy");
        person.setAge(-1);

        // 创建Person对应的DataBinder
        DataBinder binder = new DataBinder(person);

        // 设置校验
        binder.setValidator(new PersonValidator());

        // 进行校验
        binder.validate();

        // 输出结果(使用BindingResult接受DataBinder的结果)
        BindingResult result = binder.getBindingResult();
        System.out.println(result.getAllErrors());
    }
}

package com.ygq.spring6.bean.autowire;

public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}

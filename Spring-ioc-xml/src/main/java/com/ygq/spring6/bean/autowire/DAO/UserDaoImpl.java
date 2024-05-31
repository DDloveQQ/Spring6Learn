package com.ygq.spring6.bean.autowire.DAO;

public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("DAO方法执行");
    }
}

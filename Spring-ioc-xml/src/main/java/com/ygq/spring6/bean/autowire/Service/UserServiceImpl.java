package com.ygq.spring6.bean.autowire.Service;

import com.ygq.spring6.bean.autowire.DAO.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        System.out.println("Service方法执行");
        userDao.saveUser();
    }
}

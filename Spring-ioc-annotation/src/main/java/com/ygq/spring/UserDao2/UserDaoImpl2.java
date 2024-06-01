package com.ygq.spring.UserDao2;

import com.ygq.spring.UserDao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("myUserDao")  // Resource注解默认根据名称装配byName，未指定name时，使用属性名作为name
public class UserDaoImpl2 implements UserDao {

    @Override
    public void print() {
        System.out.println("Dao2层执行结束");
    }
}

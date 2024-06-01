package com.ygq.spring.UserService2;

import com.ygq.spring.UserDao.UserDao;
import com.ygq.spring.UserService.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {

    @Resource  // 当没有指定name时,依然根据name查找,此name为属性名
    // @Resource(name = "myUserDao")
    private UserDao myUserDao;
    // private UserDao userDao1;
    // 如果这里将myUserDao改名为userDao1,则ByName无法成功注入,此时的Resource回自动将模式切换为ByType
    // 而UserDao接口下由于有多个实现(UserDaoImpl,UserDaoRedisImpl,UserDaoImpl2),所以会报错

    @Override
    public void print() {
        myUserDao.print();
        System.out.println("Service2层执行结束");
    }
}

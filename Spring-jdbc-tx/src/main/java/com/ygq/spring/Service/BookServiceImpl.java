package com.ygq.spring.Service;

import com.ygq.spring.DAO.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
//    @Transactional(propagation = Propagation.REQUIRED)  // 如果当前线程上有已经开启的事务可用，那么就在这个事务中运行 --> 结果:只要有一本书买不了，就都买不了
    @Transactional(propagation = Propagation.REQUIRES_NEW)  // 不管当前线程上是否有已经开启的事务，都要开启新事务 --> 结果:能买几本就买几本,买不了的报错

    // 因为service层表示业务逻辑层，一个方法表示一个完成的功能，因此处理事务一般在service层处理
    // 将@Transactional标识在方法上，则只会为该方法加入事务
    // 而将@Transactional标识的类上，则会影响类中所有的方法

    // @Transactional(readOnly = true)将设置事务属性为 --> 只读,此时查操作正常,增删改操作将会抛出异常
    // @Transactional(timeout = 3)将事务的执行时限设为3 --> 执行超时则会报出异常
    // @Transactional(noRollbackFor = ArithmeticException.class) 设置回滚策略:当出现ArithmeticException异常时不回滚
    // @Transactional(isolation = Isolation.DEFAULT) 使用数据库默认的隔离级别
    // @Transactional(isolation = Isolation.READ_UNCOMMITTED) 读未提交
    // @Transactional(isolation = Isolation.READ_COMMITTED) 读已提交
    // @Transactional(isolation = Isolation.REPEATABLE_READ) 可重复读
    // @Transactional(isolation = Isolation.SERIALIZABLE) 串行化

    public void buyBook(Integer bookId, Integer userId) {

        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
    }
}

package com.ygq.spring;

import com.ygq.spring.Object.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JDBCTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {
        // 增
        //String sql = "INSERT INTO t_emp VALUES(null, ?, ?, ?)";
        //int result = jdbcTemplate.update(sql, "张三", 23, "男");

        // 删
        //String sql2 = "DELETE FROM t_emp WHERE id = ?";
        //int result2 = jdbcTemplate.update(sql2, 1);

        // 改
        //String sql3 = "UPDATE t_emp SET name = ? WHERE id = ?";
        //int result3 = jdbcTemplate.update(sql3, "李四", 2);

        // 查
        String sql4 = "SELECT * FROM t_emp WHERE id = ?";
        Emp emp = jdbcTemplate.queryForObject(sql4, new BeanPropertyRowMapper<>(Emp.class), 3);
        System.out.println(emp);
    }

    @Test
    public void testSelectList() {
        String sql = "SELECT * FROM t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }

    @Test
    public void testSelectSingle() {
        String sql = "SELECT COUNT(*) FROM t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}


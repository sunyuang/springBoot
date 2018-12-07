package com.sun.spring.controller;

import com.sun.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sunlei
 * @date 2018-12-06 11:27
 */

@RestController
@RequestMapping("users")
public class JdbcTemplateController {
//    private  final JdbcTemplate jdbcTemplate;
//    @Autowired
//    public JdbcTemplateController(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//    @GetMapping("/getListUsers")
//    public List<User> getListUsers(){
////        // 查询所有用户
//        String sql="select * from user";
//        return jdbcTemplate.query(sql, new Object[]{},new BeanPropertyRowMapper<>(User.class));
//    }
//
//    @GetMapping("/{id}")
//    public User getUser(@PathVariable Long id){
//        // 根据主键ID查询
//        String sql="select * from user WHERE id=?";
//        return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<>(User.class));
//    }
//    @DeleteMapping("/{id}")
//    public int deleteUser(@PathVariable Long id){
//        // 根据主键ID删除用户信息
//        String sql="DELETE FROM user WHERE id=?";
//        return jdbcTemplate.update(sql,id);
//    }
//    @PostMapping
//    public int addUser(@RequestBody User user){
//        //添加用户
//        String sql="insert into user (username, password) value(?,?)";
//        return jdbcTemplate.update(sql,user.getUsername(),user.getPassword());
//    }
//    @PutMapping("/{id}")
//    public int editUser(@PathVariable Long id, @RequestBody User user) {
//        // 根据主键ID修改用户信息
//        String sql = "UPDATE user SET username = ? ,password = ? WHERE id = ?";
//        return jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), id);
//    }
}

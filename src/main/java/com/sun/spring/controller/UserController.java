package com.sun.spring.controller;

import com.sun.spring.entity.User;
import com.sun.spring.mapper.TestDao;
import com.sun.spring.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private  final TestDao testDao;
    private  final UserMapper userDao;
    @Autowired
    public UserController(TestDao testDao, UserMapper userDao) {
        this.testDao = testDao;
        this.userDao = userDao;
    }
    @GetMapping("getListjdpUser")
    public   List<User> getListUser(){
        List<User> userList = testDao.find();
        return  userList;
    }
    @PostMapping("addUser")
    public   int addUser(@Param("user") User user){
        int cou = testDao.insert(user);
        return  cou;
    }
    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setUsername("test");
        return user;
    }
    @GetMapping("/showUser")
    public int toIndex(@Param("id") Integer id){
        int cong = userDao.deleteByPrimaryKey(id);
        return cong;
    }

//    private final User1Mapper user1Mapper;
//
//	private final User2Mapper user2Mapper;
//    @Autowired
//    public  UserController(User1Mapper userMapper, User2Mapper userMappertow) {
//        this.user1Mapper = userMapper;
//        this.user2Mapper = userMappertow;
//    }
//
//    @RequestMapping("/getUsers")
//	public List<User> getUsers() {
//		List<User> users=user1Mapper.getAll();
//		return users;
//	}
//
//    @RequestMapping("/getUser")
//    public User getUser(Long id) {
//    	User user=user2Mapper.getOne(id);
//        return user;
//    }
//
//    @RequestMapping("/add")
//    public void save(User user) {
//        user2Mapper.insert(user);
//    }
//
//    @RequestMapping(value="update")
//    public void update(User user) {
//        user2Mapper.update(user);
//    }
//
//    @RequestMapping(value="/delete/{id}")
//    public void delete(@PathVariable("id") Long id) {
//        user1Mapper.delete(id);
//    }
    
    
}
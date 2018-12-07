package com.sun.spring.controller;

import com.sun.spring.properties.MyProperties1;
import com.sun.spring.properties.MyProperties2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunlei
 * @date 2018-12-05 11:48
 * 用来注入MyProperties1测试我们编写的代码，值得注意的是Spring4.x以后，推荐使用构造函数的形式注入属性
 */
@RequestMapping("properties")
@RestController
public class PropertiesController {
    private  static final Logger log= LoggerFactory.getLogger(PropertiesController.class);
    private  final MyProperties1 myProperties1;
    private  final MyProperties2 myProperties2;
    @Autowired
    public PropertiesController(MyProperties1 myProperties1, MyProperties2 myProperties2) {
        this.myProperties1 = myProperties1;
        this.myProperties2 = myProperties2;
    }
    @GetMapping("1")
    public MyProperties1 getMyProperties1() {
        log.info("================begin======================");
        log.info(myProperties1.toString());
        log.info("================end======================");
        return myProperties1;
    }
    @GetMapping("2")
    public MyProperties2 getMyProperties2() {
        log.info("================begin======================");
        log.info(myProperties2.toString());
        log.info("================end======================");
        return myProperties2;
    }
}

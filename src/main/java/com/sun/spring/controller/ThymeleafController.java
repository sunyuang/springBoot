package com.sun.spring.controller;

import com.sun.spring.entity.Author;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sunlei
 * @date 2018-12-05 16:12
 */
@Controller
public class ThymeleafController {
    @GetMapping("index")
    public  String index(HttpServletRequest request){
        request.setAttribute("title", "我是第一个WEB页面");
        request.setAttribute("desc", "欢迎进入spring-boot");
        Author author=new Author();
        author.setAge(20);
        author.setName("Luis");
        author.setEmail("123456@qq.com");
        request.setAttribute("author", author);
        // 返回的 index 默认映射到 src/main/resources/templates/xxxx.html
        return  "index";
    }
}

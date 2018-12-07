package com.sun.spring.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * @author sunlei
 * @date 2018-12-05 11:34
 * 映射application.properties中的内容
 */
@Component//把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
@ConfigurationProperties(prefix = "my1")
public class MyProperties1 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties1{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}

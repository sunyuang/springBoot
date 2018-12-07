package com.sun.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 其中 @RestController 等同于 （@Controller 与 @ResponseBody）
 */
@RestController
@SpringBootApplication
@MapperScan("com.sun.spring.mapper")
public class Application {

	public static void main(         String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@GetMapping("/demo1")
	public String demo1() {
		return "Hello Luis";
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("来看看 SpringBoot 默认为我们提供的 Bean：");
			String[] strings = ctx.getBeanDefinitionNames();
			Arrays.sort(strings);
//			Arrays.stream(strings).forEach(System.out::println);
		};

	}
}

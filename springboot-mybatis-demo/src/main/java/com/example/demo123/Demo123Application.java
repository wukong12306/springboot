package com.example.demo123;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.search.dubbo.mapper")
@ComponentScan("com")
public class Demo123Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo123Application.class, args);
	}
}

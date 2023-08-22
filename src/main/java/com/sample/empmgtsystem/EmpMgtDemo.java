package com.sample.empmgtsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sample.empmgtsystem"})
@EnableWebMvc
@AutoConfiguration
public class EmpMgtDemo {

	public static void main(String[] args) {
		SpringApplication.run(EmpMgtDemo.class, args);
	}

}

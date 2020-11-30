package com.slk;

import com.slk.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppStart {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AppStart.class, args);

		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService.findOne());
		System.out.println(context.getBeanDefinitionNames().length);


		/**
		 * 1、SpringApplication：有很多方法
		 *
		 *
		 * 2、run方法 ---> SpringApplication构造方法
		 *
		 * 分析：@EnableAutoConfiguration注解
		 * 		@Import(AutoConfigurationImportSelector.class)
		 */

	}
}

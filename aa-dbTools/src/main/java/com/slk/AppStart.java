package com.slk;

import com.slk.components.dbTool.anno.MysqlSupport;
import com.slk.controller.UserController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.slk.dao.mapper")
@MysqlSupport
@SpringBootApplication
public class AppStart {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(AppStart.class);

		new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			UserController userController = applicationContext.getBean(UserController.class);
			userController.forTest("thread: hello...");
		}).start();
	}
}

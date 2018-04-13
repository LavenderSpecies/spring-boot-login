package cn.shop.base.login;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.shop.base.login.mapper")
public class SpringbootLoginApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoginApp.class, args);
	}
}

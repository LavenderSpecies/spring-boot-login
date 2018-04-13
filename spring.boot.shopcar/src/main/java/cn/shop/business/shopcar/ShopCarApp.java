package cn.shop.business.shopcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ShopCarApp {

	public static void main(String[] args) {
		SpringApplication.run(ShopCarApp.class, args);
	}
}

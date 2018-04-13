package cn.shop.business.shopcar.entity;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class ShopCar {
	private String shopCarId;
	private String shopCarName;
	public String getShopCarId() {
		return shopCarId;
	}
	public void setShopCarId(String shopCarId) {
		this.shopCarId = shopCarId;
	}
	public String getShopCarName() {
		return shopCarName;
	}
	public void setShopCarName(String shopCarName) {
		this.shopCarName = shopCarName;
	}
	
	
}

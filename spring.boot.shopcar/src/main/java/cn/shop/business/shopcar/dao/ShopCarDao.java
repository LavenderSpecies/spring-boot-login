package cn.shop.business.shopcar.dao;

import cn.shop.business.shopcar.entity.ShopCar;

public interface ShopCarDao {
	
	int insert(ShopCar shopCar);
	
	String findAll();
}

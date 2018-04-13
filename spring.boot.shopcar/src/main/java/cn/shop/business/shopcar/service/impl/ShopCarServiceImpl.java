package cn.shop.business.shopcar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.shop.business.shopcar.dao.ShopCarDao;
import cn.shop.business.shopcar.entity.ShopCar;
import cn.shop.business.shopcar.service.ShopCarService;

@Service
public class ShopCarServiceImpl implements ShopCarService{

	@Autowired
	private ShopCarDao shopCarDao;
	
	
	public int insert(ShopCar shopCar) {
		shopCarDao.insert(shopCar);
		return 0;
	}


	public String findAll() {
		
		return shopCarDao.findAll();
	}

}

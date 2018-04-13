package cn.shop.business.shopcar.dao.impl;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.alibaba.druid.support.json.JSONParser;

import cn.shop.business.shopcar.dao.ShopCarDao;
import cn.shop.business.shopcar.entity.ShopCar;

@Component
public class ShopCarDaoImpl implements ShopCarDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	public int insert(ShopCar shopCar) {
		// TODO Auto-generated method stub
//		shopCar =new ShopCar();
//		shopCar.setShopCarId("1234");
//		shopCar.setShopCarName("doucl");
		//mongoTemplate.getCollection("ShopCar");
		
		mongoTemplate.save(shopCar);
		//mongoTemplate.executeCommand("{'user':'linchao','id':'123456'}");
		return 1;
	}


	public String findAll() {
		List<ShopCar> shopCars= mongoTemplate.findAll(ShopCar.class);
		return  JSONObject.valueToString(shopCars);
	}

}

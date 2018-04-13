package cn.shop.business.shopcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.shop.business.shopcar.entity.ShopCar;
import cn.shop.business.shopcar.service.ShopCarService;

@Controller
public class ShopCarController {

	@Autowired
	private ShopCarService shopCarService;
	
	@RequestMapping(value="/shopcar/insert")
	@ResponseBody
	public String insert(@RequestParam("id") String id,@RequestParam("name")String name){
		ShopCar shopCar=new ShopCar();
		shopCar.setShopCarId(id);
		shopCar.setShopCarName(name);
		shopCarService.insert(shopCar);
		return "sb123";
	}
	@RequestMapping(value="/shopcar/select")
	@ResponseBody
	public String findAll(){
		return shopCarService.findAll();
	}
	
}

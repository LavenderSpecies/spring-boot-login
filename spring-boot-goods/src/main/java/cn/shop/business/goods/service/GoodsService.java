package cn.shop.business.goods.service;

import java.util.List;

import cn.shop.business.goods.entity.Goods;

public interface GoodsService {

	List<Goods> selct(Goods goods);
	
	Goods selectById(String goodsId);
	
	int insert(Goods goods);
	
	int update(Goods goods);
	
	int delete(Goods goods);
	
}

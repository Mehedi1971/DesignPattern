package com.mahedi.service;

import java.util.List;

import com.mahedi.model.OnlineShop;

public interface OnlineShopService {
	List<OnlineShop> getAllProducts();
	OnlineShop getProductById(long id);
}

package com.tns.repository;

import com.tns.entity.ShopOwner;

public interface IShopOwnerRepository {

	ShopOwner addShopOwner(ShopOwner shopOwner);

	ShopOwner updateShopOwner(ShopOwner shopOwner);

	ShopOwner searchShopOwner(int id);

	ShopOwner deleteShopOwner(int id);

	void commitTransaction();

	void beginTransaction();
}
package com.tns.services;

import java.util.List;

import com.tns.entity.*;

public interface ICustomerService {
	Item searchItem(int id);

	List<Item> searchItem(String itemName);

	Item orderItem(Item item);

	Mall searchMall(int id);

//	Boolean cancelOrder(int orderId);

	User login(User user);

	Boolean logOut();
}
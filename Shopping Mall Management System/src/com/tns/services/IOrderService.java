package com.tns.services;

import com.tns.entity.*;


public interface IOrderService {
	OrderDetails addOrder(OrderDetails order);

	OrderDetails updateOrder(OrderDetails order);

	OrderDetails searchOrder(int id);
	
	boolean cancelOrder(int id);

	Boolean cancelMall(int id);

	Item addItem(Item item);

}

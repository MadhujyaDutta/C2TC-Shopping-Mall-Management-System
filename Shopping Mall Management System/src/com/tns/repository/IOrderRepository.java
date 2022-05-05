package com.tns.repository;

import com.tns.entity.OrderDetails;

public interface IOrderRepository {

	OrderDetails addOrder(OrderDetails order);

	OrderDetails updateOrder(OrderDetails order);

	OrderDetails searchOrder(int id);

	OrderDetails deleteOrder(int id);

	void beginTransaction();

	void commitTransaction();
}
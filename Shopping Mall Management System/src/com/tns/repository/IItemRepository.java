package com.tns.repository;


import com.tns.entity.Item;

public interface IItemRepository {
	Item addItem(Item item);

	Item updateItem(Item item);

	Item searchItem(String str);
	
	Item searchItem(int id);

	Item deleteItem(int id);

	void beginTransaction();

	void commitTransaction();

}
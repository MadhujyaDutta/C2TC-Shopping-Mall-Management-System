package com.tns.repository;

import com.tns.entity.Mall;

public interface IMallRepository {
	Mall addMall(Mall mall);

	Mall updateMall(Mall mall);

	Mall searchMall(int id);
	
	Mall deleteMall(int id);

	void beginTransaction();

	void commitTransaction();
}
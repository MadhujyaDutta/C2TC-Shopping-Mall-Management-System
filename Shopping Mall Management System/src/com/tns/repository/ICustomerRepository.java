package com.tns.repository;

import com.tns.entity.Customer;

public interface ICustomerRepository {
	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer searchCustomer(int id);

	boolean deleteCustomer(int id);

	void beginTransaction();

	void commitTransaction();
}
package com.tns.repository;

import com.tns.entity.User;

public interface IUserRepository {

	User addNewUser(User user);

	User updateUser(User user);

	User searchUser(int id);

	User searchUser(User user);

	User deleteUser(int id);

	void beginTransaction();

	void commitTransaction();

}
package com.tns.repository;

import com.tns.entity.MallAdmin;

public interface IMallAdminRepository {

	MallAdmin addMallAdmin(MallAdmin mallAdmin);

	MallAdmin updateMallAdmin(MallAdmin mallAdmin);

	MallAdmin searchMallAdmin(int id);

	MallAdmin deleteMallAdmin(int id);

	void beginTransaction();

	void commitTransaction();

}
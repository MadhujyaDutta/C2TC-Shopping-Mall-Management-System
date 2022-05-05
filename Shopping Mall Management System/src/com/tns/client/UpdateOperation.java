package com.tns.client;

import java.util.*;
import com.tns.entity.*;
import com.tns.services.*;

@SuppressWarnings("unused")
public class UpdateOperation {

	public static void main(String[] args) {
		/* Entity Object Creation */
		User user;
		MallAdmin mallAdmin;
		Mall mall;
		ShopOwner shopOwner;
		Shop shop;
		Employee employee;
		List<Employee> list1 = new ArrayList<Employee>();
		Item item;
		List<Item> list2 = new ArrayList<Item>();
		Customer customer;
		OrderDetails order;
		List<OrderDetails> list3 = new ArrayList<OrderDetails>();

		/* Service Object Creation */
		IUserService uService = new UserServiceImpl();
		IAdminService aService = new AdminServiceImpl();
		IShopService sService = new ShopServiceImpl();
		IEmployeeService eService = new EmployeeServiceImpl();
		ICustomerService cService = new CustomerServiceImpl();
		IOrderService oService = new OrderServiceImpl();

		/* User */
		user = uService.searchUser(1);
		user.setName("Madhujya");
		uService.updateUser(user);

		/* Mall Admin */
		mallAdmin = uService.searchMallAdmin(1);
		mallAdmin.setPhone("7878787878");
		aService.updateMallAdmin(mallAdmin);

		/* Mall */
		mall = aService.searchMall(1);
		mall.setLocation("Guwahati");
		aService.updateMall(mall);

		/* Shop Owner */
		shopOwner = uService.searchShopOwner(1);
		shopOwner.setAddress("Beltola");
		sService.updateShopOwner(shopOwner);

		/* Shop */
		shop = sService.searchShopById(1);
		shop.setShopStatus("Close");
		sService.updateShop(shop);

		/* Employee */
		employee = eService.searchEmployee(1);
		employee.setName("Worker1");
		eService.updateEmployee(employee);

		/* Item */
		item = cService.searchItem(1);
		item.setPrice(349);
		sService.updateItem(item);

		/* Customer */
		customer = uService.searchCustomer(1);
		customer.setEmail("madhu@gmail.com");
		uService.updateCustomer(customer);
		
		/* Order */
		order = oService.searchOrder(2);
		order.setPaymentMode("CARD");
		oService.updateOrder(order);
	}
}
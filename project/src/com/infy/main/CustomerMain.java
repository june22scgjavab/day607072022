package com.infy.main;

import com.infy.Customer;
// ctrl+shift+o ( shortcut to get the import for the class in different package
public class CustomerMain {

	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.setData(1, "Ram", "A/122 Delhi");
		cust.showData();  // 0 null null
		// the default value of int is 0
		// the default value for object reference is null

	}

}

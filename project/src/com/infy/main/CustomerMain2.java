package com.infy.main;

import com.infy.Customer2;

public class CustomerMain2 {

	public static void main(String[] args) {
		Customer2 cust=new Customer2();
		cust.setData(1, "Ram", "A/122 Delhi");
		cust.showData();  // 0 null null
		// the default value of int is 0
		// the default value for object reference is null
	}

}

package com.infy;

public class Customer {
 private int custId;
 private String customerName;
 private String address;
 
 public void setData(int custId, String customerName, String address)
 {
	 // custId which is a parameter is getting priority
	 // and that is the reason the below code
	 // becomes custId being assigned to custId which is 
	 // the parameter ( local variable)
	 custId=custId;
	 customerName=customerName;
	 address=address;
 }
 
 public void showData() {
	 System.out.println(custId);
	 System.out.println(customerName);
	 System.out.println(address);
 }
}

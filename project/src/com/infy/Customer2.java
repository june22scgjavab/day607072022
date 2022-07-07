package com.infy;

public class Customer2 {
 private int custId;
 private String customerName;
 private String address;
 
 public void setData(int custId, String customerName, String address)
 {
	 // with the usage of this keyword with the variable
	 // in LHS , we are saying that the custId,customerName
	 // and address in the LHS belongs to the current object
	 // and the variables in the RHS are the parameters or 
	 // the local variables
	 this.custId=custId;
	 this.customerName=customerName;
	 this.address=address;
 }
 
 public void showData() {
	 System.out.println(custId);
	 System.out.println(customerName);
	 System.out.println(address);
 }
}

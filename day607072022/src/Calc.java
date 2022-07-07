

/* 
 * We are writing different classes for main and the actual data and actions
 * method with return value
 * 
 */
public class Calc {
 // We have num1,num2 and result as instance variables
 public int num1;
 public int num2;
 public int result; // This result is a member variable of Calc class
 
 public void setData(int n1,int n2)
 {
	 num1=n1;
	 num2=n2;
 }
 
 public int add() {
	 result=num1+num2;
	 return result;
 }
 
 public int subtract()
 {
	 result=num1-num2;
	 return result;
 }
}

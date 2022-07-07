
/*
 * If we declare the members as private, they are accessible only within the 
 * class and they are not accessible outside the class
 */
public class Calc2 {
	// We have num1,num2 and result as instance variables
	private int num1;
	private int num2;
	private int result; // This result is a member variable of Calc class

	public void setData(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}

	public int add() {
		result = num1 + num2;
		return result;
	}

	public int subtract() {
		result = num1 - num2;
		return result;
	}
}

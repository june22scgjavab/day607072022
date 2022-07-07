
/*
 * If we are not writing any access specifier with a member
 * it is called as default or package access specifier
 * Here Tester3 will be able to access the members because
 * both Calc3 and Test3 are in same package ( default package)
 */
public class Calc3 {
	// We have num1,num2 and result as instance variables
	int num1;
	int num2;
	int result; // This result is a member variable of Calc class

	void setData(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}

	int add() {
		result = num1 + num2;
		return result;
	}

	int subtract() {
		result = num1 - num2;
		return result;
	}
}

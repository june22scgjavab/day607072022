import java.util.Scanner;
public class CalculatorExercise1e {
	int num1, num2; // instance variables/attributes/properties/member variables
// add(), subtract(), divide() and multiply() are called as methods/member methods
	public void add() {
		int result = num1 + num2;
		// System.out.println(num1+num2);
		System.out.println("The result is " + result);
	}
	public void subtract() {
		int result = num1 + num2;
		System.out.println("The result is " + result); // result
	}
	public void divide() {
		int result = num1 / num2;
		System.out.println("The result is " + result);
	}
	public void multiply() {
		int result = num1 * num2;
		System.out.println("The result is " + result);
	}
	public void setData(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	public static void main(String[] args) {
		CalculatorExercise1e calculator = new CalculatorExercise1e();
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2; // This num1 and num2 are local to the main method
		int choice;
		System.out.println("Enter the value for num1");
		num1 = scan.nextInt();
		System.out.println("Enter the value for num2");
		num2 = scan.nextInt();
		calculator.setData(num1, num2);
		System.out.print("Enter your choice");
		System.out.println("1) ADD\n 2) SUBTRACT \n 3)DIVIDE \n 4)MULTIPLY");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			calculator.add();
			break;
		case 2:
			calculator.subtract();
			break;
		case 3:
			calculator.divide();
			break;
		case 4:
			calculator.multiply();
			break;
		default:
			System.out.println("Your option is wrong. Enter the value 1-4");
		}// end of switch case
	} // end of main
} // end of class

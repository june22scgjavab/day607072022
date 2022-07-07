
public class Tester2 {

	public static void main(String[] args) {
		Calc2 calc = new Calc2();
		calc.setData(20, 10);
		int result = calc.add(); // This result is local to the main method in
		// Tester and is not same as the result of the Calc class
		System.out.println(result);
		result = calc.subtract();
		System.out.println(result);
		// calc.num1=0; //The field Calc2.num1 is not visible
		// calc.num2=0; //The field Calc2.num1 is not visible
		result = calc.add();
		System.out.println(result);

	}

}

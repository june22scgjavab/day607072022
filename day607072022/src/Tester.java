
public class Tester {

	public static void main(String[] args) {
		Calc calc=new Calc();
		calc.setData(20, 10);
        int result=calc.add(); // This result is local to the main method in 
        // Tester and is not same as the result of the Calc class
        System.out.println(result);
        result=calc.subtract();   
        System.out.println(result);
        calc.num1=0;
        calc.num2=0;
        result=calc.add();
        System.out.println(result);
        
	}

}

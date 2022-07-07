import java.util.Scanner;
public class CalculatorExercise1 {
public void add(){
  int num1=20;
  int num2=10;
  int result=num1+num2;
  //System.out.println(num1+num2);
  System.out.println("The result is "+result);
}

 public void subtract(){
 int num1=100;
 int num2=20;
 int result=num1-num2;
 System.out.println("The result is "+result); //result 
}
// divide()
// multiply()

 public static void main(String[] args){
 CalculatorExercise1 calculator=new CalculatorExercise1();
 calculator.add();
 calculator.subtract();
 //calculator.divide();
 //calculator.multiply();
}
}
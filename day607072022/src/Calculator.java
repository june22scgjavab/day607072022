   public class Calculator {
    public static void main(String args[]){
    int num1=10;
    int num2=5;
    int choice=2;
    System.out.println("1) ADD");
    System.out.println("2) SUBTRACT");
    System.out.println("3) MULTIPLY");
    System.out.println("4) DIVIDE");
    switch(choice){
     case 1 : System.out.println(num1+num2);
               break;
     case 2  : System.out.println(num1-num2);
               break;
     case 3  : System.out.println(num1*num2);
               break;
     case 4  : System.out.println(num1/num2);
               break;
     default : System.out.println("The choice is incorrect!!!!");
     } // end of switch case
      
    System.out.println("Bye bye from calculator");
   } // end of main
}  // end of class

  

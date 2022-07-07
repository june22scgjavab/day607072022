import java.util.Scanner;

public class ContinueDemo {
   public static void main(String args[]){
   Scanner scanner=new Scanner(System.in);
   int num;
   int sumEven=0;
 
   while(true){
	   System.out.println("Enter the number");
	   num=scanner.nextInt();
     if(num==0){
       break;
     }
     if(num%2!=0){
      continue;
     }

     sumEven+=num;
   }
   System.out.println("The added value of even numbers:"+sumEven);
   }
}
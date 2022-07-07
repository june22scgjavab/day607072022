import java.util.Scanner;
public class BreakDemo {
   public static void main(String args[]){
   Scanner scanner=new Scanner(System.in);
   int num;
   int sum=0;
 
   while(true){
	   System.out.println("Enter the number");
	   num=scanner.nextInt();
     if(num==0){
       break;
     }
   /* else{
      sum+=num;
     } */
     sum+=num;
   }
   System.out.println("The added value:"+sum);
   }
}
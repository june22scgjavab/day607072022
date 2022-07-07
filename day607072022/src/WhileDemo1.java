
  import java.util.Scanner;
   public class WhileDemo1{
     public static void main(String args[]){
     int roll;
     String name;
     int marks;
     Scanner scan=new Scanner(System.in); // We are creating an object of Scanner class
     //Scanner class object will help us to accept user inputs
     String ans="yes";
     while(ans.equalsIgnoreCase("yes")){
        System.out.println("Enter the roll number");
        roll=scan.nextInt();  // nextInt() is a predefined method of Scanner classto accept an int value.
        System.out.println("Enter the name");
        name=scan.next(); // next() is a method to accept a String and we have another method of String which          // is nextLine(); next() wont allow to accept multiple words ... with next we can enter a single word
      // ravi can be entered with next but to enter Ravi Kumar Sharma we have to use nextLine()
         System.out.println("Enter the marks");
         marks=scan.nextInt();
         System.out.println("ROLL: "+roll+"\n"+"NAME: "+name+"\n"+"MARKS: "+marks);
         System.out.println("Do you want to continue?");
         ans=scan.next();
      } // end of while loop
     } // end of main method
   }  // end of class


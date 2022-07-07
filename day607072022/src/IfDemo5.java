public class IfDemo5 {

	public static void main(String[] args) {
	
		int marks=-10;
          if(marks>0)
            {
		if(marks>=90) 
		{
			System.out.println("Good score");
		}
		else if(marks>=70 && marks<90) {
			System.out.println("Done well");
		}
		
         else
                {
                	System.out.println("Work Hard!!!!");
                }

           } // end of outer if
           else{
                System.out.println("Please enter valid marks");
               }

	}  // End of main

}   // End of class



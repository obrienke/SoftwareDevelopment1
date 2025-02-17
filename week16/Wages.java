// Program calculates wages.

import java.util.Scanner;

public class Wages{
   // calculates wages for 3 employees
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      int counter = 1; 
	   double pay = 0; // gross pay
	   double hours = 0;
	   double rate = 0;
	  
      // repeat calculation for 3 employees
      while (counter <= 3){
         System.out.print("Enter hours worked: ");
         hours = input.nextDouble();

         System.out.print("Enter hourly rate: ");
         rate = input.nextDouble();

         // calculate wages
         if (hours > 40) // with overtime
            pay = (40.0 * rate) + ((hours - 40) * (rate * 1.5));
         else // straight time
            pay = hours * rate;

         // print the pay for the current employee
         System.out.println("Pay for Employee "+counter+" is: "+pay);
		   System.out.println();
         counter = counter + 1;
      } // end while
      input.close();
   } // end main
} // end class Wages

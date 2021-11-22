/**

Name:			Months

Description: 	Program prompts user to enter a number for month and the year. Then prints out the number of days for that month.
				Note, that february has one more day in a leap year.

Created By: 	Kevin O'Brien

Created On: 	23/11/2020

*/

import java.util.Scanner; // program uses Scanner

public class Months
{
   public static void main(String[] args)
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      int month; // number input by user
      int year; // number input by user

      int feb = 28; //number of days in feb


      System.out.print("Enter a number for month: "); // prompt for input
      month = input.nextInt(); // read length integer

	  System.out.println();

      System.out.print("Enter a number for year: "); // prompt for input
      year = input.nextInt(); // read length integer

	  System.out.println();

	  if(year%4 == 0)
	  	feb = 29; // leap year so february has 29 days.

      if(month > 12)
      	System.out.println("Not a valid month");

      if(month < 1)
      	System.out.println("Not a valid month");

      if(month == 1)
      	System.out.println("Number of days in january is 31.");

      if(month == 2)
      	System.out.println("Number of days in february is "+feb+".");

      if(month == 3)
      	System.out.println("Number of days in march is 31.");

      if(month == 4)
      	System.out.println("Number of days in april is 30.");

      if(month == 5)
      	System.out.println("Number of days in may is 31.");

      if(month == 6)
      	System.out.println("Number of days in june is 30.");

      if(month == 7)
      	System.out.println("Number of days in july is 31.");

      if(month == 8)
      	System.out.println("Number of days in august is 31.");

      if(month == 9)
      	System.out.println("Number of days in september is 30.");

      if(month == 10)
      	System.out.println("Number of days in october is 31.");

      if(month == 11)
      	System.out.println("Number of days in november is 30.");

      if(month == 12)
      	System.out.println("Number of days in december is 31.");

      System.out.println();
      input.close();
   } // end method main
} // end class Months

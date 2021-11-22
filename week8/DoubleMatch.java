/**

Name:			DoubleMatch

Description: 	Program that reads in two decimal numbers and tests whether they are the same up to three decimal places.

Created By: 	Kevin O'Brien

Created On: 	20/10/2017

*/

import java.util.Scanner; // program uses Scanner

public class DoubleMatch
{
   public static void main(String[] args)
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      double number1, number2; // number input by user

      System.out.print("Enter a decimal number: "); // prompt for input
      number1 = input.nextDouble(); // read length integer

      System.out.print("Enter a another decimal number: "); // prompt for input
      number2 = input.nextDouble(); // read length double

	  System.out.println();

	  if((Math.round(number1 * 1000)) == (Math.round(number2 * 1000)))
	  	System.out.println("Numbers are an exact match.");

	  if((Math.round(number1 * 1000)) != (Math.round(number2 * 1000)))
	  	System.out.println("Numbers do not match.");

	  System.out.println();
     input.close();
   } // end method main
} // end class DoubleMatch

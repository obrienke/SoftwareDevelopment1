/**

Name:			Rounding

Description: 	Program prompts user to enter a number of type double. This number is then multiplied by 1000 and rounded.

Created By: 	Kevin O'Brien

Created On: 	20/10/2017

*/

import java.util.Scanner; // program uses Scanner

public class Rounding
{
   public static void main(String[] args)
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      double number; // number input by user

      System.out.print("Enter a decimal number: "); // prompt for input
      number = input.nextDouble(); // read length integer
      int res = (int) Math.round(number * 1000); //cast the result to int and store it as an int in res.

	  System.out.println();
	  System.out.println("Number entered times 1000, with result rounded is: "+(res));
	  //alternative way:
	  System.out.println("Number entered times 1000, with result rounded is: "+(Math.round(number * 1000)));
	  System.out.println();
     input.close();
   } // end method main

} // end class Rounding

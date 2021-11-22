/**

Name:			Large

Description: 	Program calculates the largest of three numbers entered by the user

Created By: 	Kevin O'Brien

Created On: 	23/11/2020

*/

import java.util.Scanner;

public class Large
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      // numbers to be entered
      int firstNumber;
      int secondNumber;
      int thirdNumber;

      // largest
      int largest;

      System.out.print("Enter first number: "); // prompt for input
      firstNumber = input.nextInt(); // read first number

      // initially firstNumber is the largest
      largest = firstNumber;

      System.out.print("Enter second number: "); // prompt for input
      secondNumber = input.nextInt(); // read second number

      // determine whether secondNumber is the largest
      if (secondNumber > largest)
         largest = secondNumber;

      System.out.print("Enter third number: "); // prompt for input
      thirdNumber = input.nextInt(); // read third number

      // determine whether thirdNumber is the largest
      if (thirdNumber > largest)
         largest = thirdNumber;

      // display results
      System.out.println("Numbers input: "+firstNumber+", "+
         secondNumber+", "+thirdNumber);
      System.out.println("Largest number is: "+largest);
      input.close();
   } // end main
} // end class Large


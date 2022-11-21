// Exercise 4 Solution: AllDigits.java
// Program breaks apart a five-digit number
import java.util.Scanner;

public class AllDigits {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      int number; // number input by user
      int digit1; // first digit
      int digit2; // second digit
      int digit3; // third digit
      int digit4; // fourth digit
      int digit5; // fifth digit

      System.out.print("Enter five-digit integer: "); // prompt
      number = input.nextInt(); // read number

      // determine the five digits
      digit1 = number / 10000;
      digit2 = number % 10000 / 1000;
      digit3 = number % 1000 / 100;
      digit4 = number % 100 / 10;
      digit5 = number % 10;

      // output results
      System.out.printf("Digits in %d are %d  %d  %d  %d  %d%n",
         number, digit1, digit2, digit3, digit4, digit5);
      input.close();   
   } // end main
} // end class Five


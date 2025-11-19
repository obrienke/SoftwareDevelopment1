import java.util.Scanner;
public class LargeSmall{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      // numbers to be entered
      int firstNumber;
      int secondNumber;
      int thirdNumber;
      int fourthNumber;
      int fifthNumber;

      // largest and smallest
      int largest;
      int smallest;

      System.out.print("Enter first number: "); // prompt for input
      firstNumber = input.nextInt(); // read first number

      // initially firstNumber is the smallest and the largest
      smallest = firstNumber;
      largest = firstNumber;

      System.out.print("Enter second number: "); // prompt for input
      secondNumber = input.nextInt(); // read second number

      // determine whether secondNumber is the smallest
      if (secondNumber < smallest)
         smallest = secondNumber;

      // determine whether secondNumber is the largest
      if (secondNumber > largest)
         largest = secondNumber;

      System.out.print("Enter third number: "); // prompt for input
      thirdNumber = input.nextInt(); // read third number

      // determine whether thirdNumber is the smallest
      if (thirdNumber < smallest)
         smallest = thirdNumber;

      // determine whether thirdNumber is the largest
      if (thirdNumber > largest)
         largest = thirdNumber;

      System.out.print("Enter fourth number: "); // prompt for input
      fourthNumber = input.nextInt(); // read fourth number

      // determine whether fourthNumber is the smallest
      if (fourthNumber < smallest)
         smallest = fourthNumber;

      // determine whether fourthNumber is the largest
      if (fourthNumber > largest)
         largest = fourthNumber;

      System.out.print("Enter fifth number: "); // prompt for input
      fifthNumber = input.nextInt(); // read fifth number

      // determine whether fifthNumber is the smallest
      if (fifthNumber < smallest)
         smallest = fifthNumber;

      // determine whether fifthNumber is the largest
      if (fifthNumber > largest)
         largest = fifthNumber;

      // display results
      System.out.println("Numbers input: "+firstNumber+", "+secondNumber+", "+thirdNumber+", "+fourthNumber+", "+fifthNumber);
      System.out.println("Smallest number is: "+smallest);
      System.out.println("Largest number is: "+largest);
      input.close();
   } // end main
} // end class LargeSmall


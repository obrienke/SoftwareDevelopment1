import java.util.Scanner; // program uses Scanner

public class Addition{
   public static void main(String[] args){
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      int number1; // first number input by user
      int number2; // second number input by user
      int sum; //variable to store result

      System.out.print("Enter first integer: "); // prompt for input
      x = input.nextInt(); // read first integer
      System.out.print("Enter second integer: "); // prompt for input
      y = input.nextInt(); // read first integer

      sum = number1 + number2;
      System.out.println(number1 + " + " + number2 + " = " +sum);
   } // end method main
} // end class Addition


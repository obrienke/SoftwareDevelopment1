import java.util.Scanner;

public class AddProduct {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int one = 0, two = 0, three = 0, result = 0;
       
       System.out.print("Enter first number: ");
       one = input.nextInt();
       System.out.print("Enter second number: ");
       two = input.nextInt();
       System.out.print("Enter third number: ");
       three = input.nextInt();
       
       result = one + two + three;
       System.out.println(one + " + " + two + " + " + three + " = " + result);

       result = one * two * three;
       System.out.println(one + " * " + two + " * " + three + " = " + result);
       input.close(); 
    }
}

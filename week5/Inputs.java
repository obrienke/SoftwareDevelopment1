import java.util.Scanner;

public class Inputs{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double dec;
    int number;
    String name;

    System.out.print("Enter your first name: ");
    name = input.next();

    System.out.print("Enter a whole number: ");
    number = input.nextInt();

    System.out.print("Enter a decimal number: ");
    dec = input.nextDouble();

    System.out.println();
    System.out.println(name+", you entered the numbers "+number+" and "+dec+".");
    input.close();
  }
}
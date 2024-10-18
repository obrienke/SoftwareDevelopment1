import java.util.Scanner;

public class InputDouble{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double dec;

    System.out.print("Enter a decimal number: ");
    dec = input.nextDouble();

    System.out.println("Number entered is: "+dec);
    input.close();
  }
}
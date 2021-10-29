import java.util.Scanner;

public class InputNumber{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number;
    
    System.out.print("Enter a number: ");
    number = input.nextInt();
    
    System.out.println("Number entered is: "+number);
    input.close();
  }
}
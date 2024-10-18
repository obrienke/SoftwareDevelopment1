import java.util.Scanner;

public class InputString{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String name;

    System.out.print("Enter your first name: ");
    name = input.next();

    System.out.println("Hello "+name);
    input.close();
  }
}
import java.util.Scanner;

public class NoIterations{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x;
    int y;
    int z;
    
    System.out.print("Enter a number: ");
    x = input.nextInt();
    System.out.print("Enter a number: ");
    y = input.nextInt();
    System.out.print("Enter a number: ");
    z = input.nextInt();
    
    int result = (x + y + z) / 3;
    
    System.out.println("Result is: "+result);
    input.close();
  }

}
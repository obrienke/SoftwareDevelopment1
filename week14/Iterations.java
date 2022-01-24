import java.util.Scanner;

public class Iterations{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x = 0;
    int counter = 0;
    int max_counter = 0;

    System.out.print("Number of grades: ");
    max_counter = input.nextInt();

    while(counter < max_counter){
    	System.out.print("Enter a number: ");
    	x = x + input.nextInt();
    	counter = counter + 1;
    }

    int result = (x) / max_counter;

    System.out.println("Result is: "+result);
    input.close();
  }

}
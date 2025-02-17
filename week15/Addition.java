import java.util.Scanner;

public class Addition{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int counter = 1;
    int total = 0;

    while(counter <= 5){
      System.out.print("Enter number "+counter+": ");
      total = total + input.nextInt();
      counter = counter + 1;
    }
    System.out.println();
    System.out.println("When the five numbers are added together the result is: "+total);
    System.out.println();
    input.close();
  }
}
import java.util.Scanner;

public class Comparison{
  public static void main(String args[]){
    int number1;
	int number2;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	number1 = input.nextInt();

	System.out.print("Enter second number: ");
	number2 = input.nextInt();
	
	if(number1 == number2){
	  System.out.println(number1+" == "+number2);
	}
	if(number1 != number2){
	  System.out.println(number1+" != "+number2);
	}
	if(number1 < number2){
	  System.out.println(number1+" < "+number2);
	}
	if(number1 > number2){
	  System.out.println(number1+" > "+number2);
	}
	if(number1 <= number2){
	  System.out.println(number1+" <= "+number2);
	}
	if(number1 >= number2){
	  System.out.println(number1+" >= "+number2);
	}
	input.close();
  }
}


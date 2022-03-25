/*
Program Name: Two - Exercise for submission on week 20.

Description: Prompt the user to enter two numbers. Using logical operators && and ||,
Determine if:
 - both numbers are equal to 2, use logical &&
 - one of the numbers is equal to 2, use logical || 
     -- If one of the numbers is 2, print out which number entered is equal to 2.
 - neither of the numbers is equal to 2
 
Variables/Types: int first, int second

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Two{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
   
    //Declare variables/types
	int first = 0; 
	int second = 0;
	
    //Add code here for Inputs, if/else statements, while loops
	System.out.print("Enter first number: ");
    first = input.nextInt();
	System.out.print("Enter second number: ");
    second = input.nextInt();
	
	if(first == 2 && second == 2){
		System.out.println("Both numbers entered are equal to two.");
	}else if(first == 2 || second == 2){
		if(first == 2){
			System.out.println("First number entered is equal to 2");
		}else{
			System.out.println("Second number entered is equal to 2");
		}
	}else{
		System.out.println("Neither number entered is equal to 2");		
	}
  }
}
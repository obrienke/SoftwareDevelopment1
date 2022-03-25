/*
Program Name: EqualDiffFour - Exercise 4, week 20.

Description: Prompt the user to enter four numbers. Using logical operators && and ||
Determine if:
 - all numbers entered are equal - use &&,
 - all numbers entered are different,
 - all numbers entered are neither different or equal - use || 
 
Variables/Types: int first, int second, int third, int fourth

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class EqualDiffFour{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
   
    //Declare variables/types
	int first = 0; 
	int second = 0;
	int third = 0;
	int fourth = 0;
	
    //Add code here for Inputs, if/else statements, while loops
	System.out.print("Enter first number: ");
    first = input.nextInt();
	System.out.print("Enter second number: ");
    second = input.nextInt();
	System.out.print("Enter third number: ");
    third = input.nextInt();
	System.out.print("Enter fourth number: ");
    fourth = input.nextInt();

	
	if(first == second && second == third && third == fourth ){
		System.out.println("All numbers are equal");
	}else if(first == second || first == third || first == fourth || second == fourth || second == third || third == fourth){
		System.out.println("Neither all are equal or different");
	}else{
		System.out.println("All numbers are different");		
	}
  }
}
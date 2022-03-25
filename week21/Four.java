/*
Program Name: Four - Exercise 2, week 20.

Description: Prompt the user to enter four numbers. Using logical operators &&
Determine if the numbers entered are:
 - in increasing order,
 - in decreasing order,
 - in neither increasing or decreasing order 
 
Variables/Types: int first, int second, int third, int fourth

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Four{
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
	
	if(first < second && second < third && third < fourth){
		System.out.println("Numbers are in increasing order");
	}else if(first > second && second > third && third > fourth){
		System.out.println("Numbers are in decreasing order");
	}else{
		System.out.println("Numbers entered are not in increasing or decreasing order");		
	}
  }
}
/*
Program Name: Good - Exercise 5 , week 20.

Description: Prompt the user to enter a number. Using logical operators && and ||
Determine if the number entered :
 - is between 7 and 10 or 15 and 20 or greater than 100.
If it is then print out "You have entered a good number".

Variables/Types: int first

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Good{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
	int first = 0;

    //Add code here for Inputs, if/else statements, while loops
	System.out.print("Enter a number: ");
    first = input.nextInt();

	if((first > 7 && first < 10) || (first > 15 && first < 20) || first > 100){
		System.out.println("You have entered a good number");
	}
  }
}
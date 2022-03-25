/*
Program Name: ValidDate - Exercise 6, week 20.

Description: Write a Java program that reads a date from the user in numeric form.
For example, February 17, 2019 would be entered as the three integers 2, 17, and 2019.
Your program must then determine if the date is a "valid" date.
Use the following information to determine if the date is valid:
 - January, March, May, July, August, October, and December all have 31 days.
 - April, June, September, and November all have 30 days.
 - February has 28 days in a non-leap year and 29 days in a leap year
 - (Note a leap year is leaves no remainder when divided by 4).
Print either "valid date" or "invalid date" as output.
Your program should make use of logical And OR operators (|| &&).

Variables/Types: int day, month, year

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class ValidDate{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
	int day = 0;
	int month = 0;
	int year = 0;
	boolean valid = true;
	boolean leap = false;

    //Add code here for Inputs, if/else statements, while loops
	System.out.print("Enter a day: ");
    day = input.nextInt();
	System.out.print("Enter a month: ");
    month = input.nextInt();
	System.out.print("Enter a year: ");
    year = input.nextInt();

	if(year % 4 == 0){
		leap = true;
	}
	
	if(month > 0 && month < 13){
		if ((month == 9 || month == 4 || month == 6 || month == 11) && day > 30){
			valid = false;
		}else if((month == 2 && (leap) && day > 29)||(month == 2 && (!leap) && day > 28)){
			valid = false;
		}else if(day > 31){
			valid = false;
		}
	}else{
		valid = false;
	}

	if(valid){
		System.out.println("Valid date");
	}else{
		System.out.println("Invalid date");
	}
  }
}
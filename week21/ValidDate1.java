/*
Program Name: ValidDate1 - Exercise 8, week 20.

Description: Modify ValidDate so that a leap year is now determined by the logic used in the previous exercise - Leap.java.

Variables/Types: int day, month, year, boolean valid, boolean leap

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class ValidDate1{
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
		if(year % 100 == 0 && year % 400 != 0){ //only true if its a century
			leap = false;
		}
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
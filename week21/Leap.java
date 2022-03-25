/*
Program Name: Leap - Exercise 7, week 20.

Description: So far any program you have written where a requirement exists to determine if a year is a leap
year has stated that a year that is divided by four and leaves no remainder is a leap year. However there
are some years which are exceptions to this rule.

In fact if the year is also divisible by 100 then it is not a leap year, unless it is divisible by 400.
This means that years such as 1992, 1996 are leap years because they are divisible by 4
and are not affected by the rest of the rule which applies to century years such as 1900 and 2000.
Century years are not leap years except where they are a multiple of 400.
Hence, the years 1700, 1800 and 1900 were not leap years and did not contain a February 29.
But the year 2000 was a leap year, the first such century leap year since 1600.

With this in mind, write a Java program, Leap.java, which reads a year (integer) from the user and decides whether that year is a leap year.

Variables/Types: int year, boolean leap

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Leap{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
	int year = 0;
    boolean leap = false;

    //Add code here for Inputs, if/else statements, while loops
	System.out.print("Enter a year: ");
    year = input.nextInt();

	if(year % 4 == 0){
		leap = true;
		if(year % 100 == 0 && year % 400 != 0){ //only true if its a century
			leap = false;
		}
    }

	System.out.println(year+(leap ? " is a leap year" : " is not a leap year"));

  }
}
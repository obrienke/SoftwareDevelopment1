/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class Dollars{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		double dollars = 0;
        double euro = 0;
        double result = 0;

		System.out.print("Enter euro to US Dollar conversion rate: ");
        dollars = input.nextDouble();
		System.out.print("Enter amount of euro to convert to US Dollars: ");
        euro = input.nextDouble();
		
        result = Math.round(euro * dollars * 100.0) / 100.0;
		//Include prompts for inputs and assign inputs to variables
		System.out.println(euro + " euro will get you :" + result + " US Dollars.");
		//Other logic - arithmetic and decision making logic
		
		//Outputs
		
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}

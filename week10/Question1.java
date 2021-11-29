/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class Question1{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		
		//Declare and initialise program variables
		int choice = 0;
		int total = 0;
		
		//Include prompts for inputs and assign inputs to variables
		System.out.println("Question 1");
		System.out.println("The code below produces which output to the screen?");
		System.out.println();
		System.out.println("int x = 65;");
		System.out.println("if(x > 65){");
		System.out.println("   System.out.println(x);");
		System.out.println("}");
		System.out.println();
		System.out.println("Select option");
		System.out.println("1. 65");
		System.out.println("2. Nothing is printed to the screen");
		System.out.println();
		System.out.print("Enter choice (1 or 2): ");
		choice = input.nextInt();

		if(choice == 2){
			System.out.println("correct");
			total = total + 1;
		}else{
			System.out.println("incorrect");
		}

		System.out.println("Question 2");
		System.out.println("The code below produces which output to the screen?");
		System.out.println();
		System.out.println("int x = 1;");
		System.out.println("int y = 2;");
		System.out.println();
		System.out.println("if( x == 1 && y == 2){");
		System.out.println("   System.out.println(true);");
		System.out.println("}else{");
		System.out.println("   System.out.println(false);");
		System.out.println("}");
		System.out.println();
		System.out.println("Select option");
		System.out.println("1. false");
		System.out.println("2. true");
		System.out.println("3. No output");
		System.out.println();

		System.out.print("Enter choice (1, 2 or 3): ");
		choice = input.nextInt();

		if(choice == 2){
			System.out.println("correct");
			total = total + 1;
		}else{
			System.out.println("incorrect");
		}
		
		System.out.println();
		System.out.println("You scored "+total+" out of 2");
		
		//Other logic - arithmetic and decision making logic
		
		//Outputs
		
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}

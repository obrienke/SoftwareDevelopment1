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

		System.out.println("Question 3");
		System.out.println("The code below produces which output to the screen?");
		System.out.println();
		System.out.println("int x = 1;");
		System.out.println();
		System.out.println("if( x != 1){");
		System.out.println("   System.out.println(\"not equal to 1\");");
		System.out.println("}else{");
		System.out.println("   System.out.println(\"equal to 1\");");
		System.out.println("}");
		System.out.println();
		System.out.println("Select option");
		System.out.println("1. not equal to 1");
		System.out.println("2. equal to 1");
		System.out.println("3. no output");
		System.out.println("4. error");
		System.out.println();

		System.out.print("Enter choice (1, 2, 3 or 4): ");
		choice = input.nextInt();

		switch(choice){
			case 1: 
				System.out.println("incorrect");
				break;
			case 2:
				System.out.println("correct");
				total = total + 1;
				break;				
			case 3:
				System.out.println("incorrect");
				break;
			case 4:
				System.out.println("incorrect");
				break;
			default:
				System.out.println("invalid entry");
		}

		System.out.println("Question 4");
		System.out.println("String num = \"22\"");
		System.out.println("What is the value of num. Do not include quotation marks");
		System.out.println();
		String answer = input.next();
		if(answer.equals("22")){
			System.out.println("correct");
			total = total + 1;
		}else{
			System.out.println("incorrect");
		}

		System.out.println("Question 5");
		System.out.println("How many choices are possible when using a single if-else statement?");
		System.out.println();
		System.out.println("Select option");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println();

		System.out.print("Enter choice (1, 2, 3 or 4): ");
		choice = input.nextInt();

		if(choice == 2){
			System.out.println("correct");
			total = total + 1;
		}else{
			System.out.println("incorrect");
		}		
		System.out.println();
		System.out.println("You scored "+total+" out of 5");
		double result = total * 1.0 / 5 * 100;
		System.out.println("Score as a percentage: "+result);
		
		if(result >= 80){
			System.out.println("Distinction");
		}else if(result >= 40){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}

		
		//Other logic - arithmetic and decision making logic
		
		//Outputs
		
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}

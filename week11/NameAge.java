/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class NameAge{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		
		//Declare and initialise program variables
		int age = 0;
        String name = "";

		//Include prompts for inputs and assign inputs to variables
		System.out.print("Enter your first name: ");
        name = input.next();
        System.out.print("Enter your age: ");
        age = input.nextInt(); 
		//Other logic - arithmetic and decision making logic
		
		//Outputs
		System.out.println(name + " you are " + age + " years old. In 20 years time you will be " + (age + 20) + " years old.");
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}

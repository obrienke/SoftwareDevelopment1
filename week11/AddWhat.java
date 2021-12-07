/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class AddWhat{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		int number = 0;
		int result = 0;
		int add = 0;
		
		System.out.print("Enter a number: ");
        number = input.nextInt();
		
        if(number > 100){
			add = 10;
        }else if(number > 50){
			add = 20;
        }else{
			add = 30;
		}

		result = number + add;
		//Outputs
		
		System.out.println(number + " + " + add + " = " + result);
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}

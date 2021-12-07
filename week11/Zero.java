/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class Zero{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Enter a number: ");
        number = input.nextInt();
		
        if(number == 0){
            System.out.println("The number entered is EQUAL to zero");
        }else{
            System.out.println("The number entered is NOT EQUAL to zero");
        }
		//Outputs
		
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}

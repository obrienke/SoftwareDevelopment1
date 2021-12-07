/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class BigNumber{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		System.out.print("Enter a number: ");
        number = input.nextInt();
		
        if(number > 1000000){
            System.out.println("The number entered is greater than 1 million");
        }else{
            System.out.println("The number entered is not greater than 1 million");
        }
		//Outputs
		
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}

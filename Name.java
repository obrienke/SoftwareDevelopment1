/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class Name{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		String name;

        System.out.print("Enter name: ");
        name = input.next();
		
        //if(name == "Kevin") // won't work, use equals method instead
        if(name.equals("Kevin")){
            System.out.println("right name");
        }else{
            System.out.println("wrong name");
        }
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}

/* 
Program Template which can be used for Lab Exercises
*/

//uncomment next line if inputs are required in your program
import java.util.Scanner;

public class Login{
	public static void main(String[] args){
		//uncomment next line if inputs are required in your program
		Scanner input = new Scanner(System.in);
		String name;
        int x;

        System.out.print("Enter username: ");
        name = input.next();
        System.out.print("Enter Id: ");
        x = input.nextInt();
		
        if(name.equals("user1") && x == 1000 || name.equals("user2") && x == 2000){
            System.out.println("Login ok");
        }else{
            System.out.println("access denied");
        }

        //don't copy the next bit!!
        //Just an alternative way to check username and id are valid
        if(name.equals("user1")){
            if(x == 1000){
                System.out.println("Login ok"); 
            }else{
                System.out.println("access denied");
            }        
        }else{
            if(name.equals("user2")){
                if(x == 2000){
                    System.out.println("Login ok"); 
                }else{
                    System.out.println("access denied");
                }        
            }else{
                System.out.println("access denied"); 
            } 
        }
		//uncomment next line if inputs are required in your program
		input.close();	
	}
}

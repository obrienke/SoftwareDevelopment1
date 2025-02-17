import java.util.Scanner;

public class AddWhat2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	        int x = 0;
	
	        System.out.print("Enter a number: ");
	        x = input.nextInt();
	
	        if(x > 100){
	            x *= 10;
	        }else if(x > 75 && x <= 100){
	            x *= 8;
	        }else if(x > 50 && x <= 75){
	            x *= 6;
	        }else if(x > 25 && x <= 50){
	            x *= 4;
	        }else{
	            x /= 2;
	        }
	
	        System.out.println("Number updated to: "+x);
		
		input.close();	
	}
}

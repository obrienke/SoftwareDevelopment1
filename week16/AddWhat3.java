import java.util.Scanner;

public class AddWhat3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.print("Enter a number: ");
        x = input.nextInt();

        if(x > 100){
            x += 10;
        }else if(x > 50 && x <= 100){
            x += 5;
        }else if(x > 20 && x <= 50){
            x += 2;
        }else{
            x++;
        }

        System.out.println("Number updated to: "+x);
		
		input.close();	
	}
}
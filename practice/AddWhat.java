import java.util.Scanner;
public class AddWhat{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0;

		System.out.println();
		System.out.print("Enter a number: ");
		x = input.nextInt();

		if(x > 10 && x < 20){
			x = x + 100;
		}else if(x > 40 && x < 50){
			x = x + 400;
		}else{
			x = x + 10;
		}
		
		System.out.println();
		System.out.println("Number updated to: " + x);
		System.out.println();
        input.close();
    }
}
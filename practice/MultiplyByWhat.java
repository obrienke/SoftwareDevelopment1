import java.util.Scanner;
public class MultiplyByWhat{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0;
		System.out.println();
		System.out.print("Enter a number: ");
		x = input.nextInt();
		if(x > 20 && x < 30){
			x = x * 3;
		}else if(x > 40 && x < 50){
			x = x * 5;
		}else if(x > 60 && x < 70){
			x = x * 7;
		}else if(x > 80 && x < 90){
			x = x * 9;
		}else{
			x = x * 10;
		}
		System.out.println();
		System.out.println("Number updated to: " + x);
		System.out.println();
        input.close();
    }
}
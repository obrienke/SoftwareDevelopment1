import java.util.Scanner;
public class Ton{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0; 

		System.out.println();
		System.out.print("Enter a number: ");
		x = input.nextInt();
		
		System.out.println();
		if(x == 100){
			System.out.println("Number entered is equal to 100");	
		}else{
			System.out.println("Number entered is not equal to 100");
		}
		System.out.println();
        input.close();
    }
}
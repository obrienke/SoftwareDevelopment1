import java.util.Scanner;
public class OneTwoThree{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0; 

		System.out.println();
		System.out.print("Enter 1, 2 or 3: ");
		x = input.nextInt();
		
		System.out.println();
		switch(x){
			case 1:
				System.out.println("You entered 1");
				break;
			case 2:
				System.out.println("You entered 2");
				break;
			case 3:
				System.out.println("You entered 3");
				break;
			default:
				System.out.println("You did not enter 1, 2, or 3");
		}
		System.out.println();
        input.close();
    }
}
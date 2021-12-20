import java.util.Scanner;
public class Formula{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0; 
		int y = 0; 
		int z = 0;

		System.out.println();
		System.out.print("Enter a value for x: ");
		x = input.nextInt();
		System.out.print("Enter a value for y: ");
		y = input.nextInt();
		System.out.print("Enter a value for z: ");
		z = input.nextInt();

		System.out.println();
		System.out.println(x + " + " + y + " * " + z + " = " + (x + y * z));
		System.out.println();
        input.close();
    }
}
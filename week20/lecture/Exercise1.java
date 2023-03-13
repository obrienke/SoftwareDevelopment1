import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first=0, second=0, third=0, fourth=0;

        System.out.print("Enter number 1: ");
        first = input.nextInt();
        System.out.print("Enter number 2: ");
        second = input.nextInt();
        System.out.print("Enter number 3: ");
        third = input.nextInt();
        System.out.print("Enter number 4: ");
        fourth = input.nextInt();

        int result = (first + second + third + fourth) * 4;

        System.out.println("(" + first + " + " + second + " + " + third 
                            + " + " + fourth + ") * 4 = " + result);


        input.close();
    }
}
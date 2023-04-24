import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        System.out.print("Enter third number: ");
        third = input.nextInt();
        System.out.print("Enter fourth number: ");
        fourth = input.nextInt();
       
        System.out.println();
        System.out.println("(" + first + " + " + second + " + " + third + " + " + fourth +") * 2 = " + ((first + second + third + fourth) * 2));
        input.close();
    }
}

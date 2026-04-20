import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter third number: ");
        num3 = input.nextInt();
        double res = avg(num1, num2, num3);
        System.out.println("Average of 3 numbers is: " + res);
        input.close();
    } // end of main

    static double avg(int x, int y, int z){
        double res = 0;
        res = x + y + z;
        res /= 3;
        return res;
        // return (x + y + z)/3.0;
    }

}

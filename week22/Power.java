import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        
        System.out.println(powerOf(num1, num2));
        System.out.println(Math.pow(num1, num2));
        input.close();
    }

    static int powerOf(int first, int second){
        int result = 1;
        for(int i = 0; i < second; i++){
            result *= first; // result = result * first
        }
        return result;
    }
}

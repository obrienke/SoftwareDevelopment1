import java.util.Scanner;
public class MultipleElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        if(num1%num2 == 0){
            System.out.println(num1 + " is a multiple of " + num2);
        }else{
            System.out.println(num1 + " is a not multiple of " + num2);
        }
        input.close();
    }
}

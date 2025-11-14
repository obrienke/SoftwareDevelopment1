import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter number: ");
        number = input.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is an even number.");
        }
        if(number % 2 == 1){
            System.out.println(number + " is an odd number.");
        }
        input.close();
    }
}

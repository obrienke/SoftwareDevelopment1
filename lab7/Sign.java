import java.util.Scanner;
public class Sign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number > 0){
            System.out.println(number + " is a positive number");
        }
        if(number < 0){
            System.out.println(number + " is a negative number");
        }
        if(number == 0){
            System.out.println(number + " is zero");
        }
        input.close();
    }
}

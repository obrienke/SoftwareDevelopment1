import java.util.Scanner;
public class FirstCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = input.nextInt();
        if(number == 7){
            System.out.println("Number entered is 7");
        }
        input.close();
    }
}

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = input.nextInt();
        if((number >= 1 && number <= 10) || (number >= 50 && number <= 100)){
            System.out.println(number + " is in valid range");
        }else{
            System.out.println(number + " is NOT in valid range");
        }
        input.close();
    }
}

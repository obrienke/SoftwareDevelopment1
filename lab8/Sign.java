import java.util.Scanner;
public class Sign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number == 0){
            System.out.println("Number is zero");
        }else if(number > 0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
        input.close();
    }
}

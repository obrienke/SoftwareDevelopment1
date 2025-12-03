import java.util.Scanner;
public class NumberRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number >= 10 && number <= 20){
            System.out.println("Number is between 10 and 20");
        }else{
            System.out.println("Number is not between 10 and 20");
        }
        input.close();
    }
}

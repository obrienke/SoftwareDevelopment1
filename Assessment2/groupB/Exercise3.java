import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number < 10){
            System.out.println("Number is less than 10");
        }else{
            System.out.println("Number is not less than 10");
        }
        input.close();
    }
}
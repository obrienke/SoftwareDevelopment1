import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int age = 29;

        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number == age){
            System.out.println("The number entered matches my age");
        }else{
            System.out.println("The number entered doe not match my age");
        }
        input.close();
    }
}

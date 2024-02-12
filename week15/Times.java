import java.util.Scanner;
public class Times{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int choice = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.print("Enter 1 or 2: ");
        choice = input.nextInt();

        if(choice == 1 || choice == 2){
            int i = 1;
            while(i <= 12){
                if(choice == 1){ // Addition
                    System.out.println(number + " + " + i + " = " + (i + number));
                }else{ // Multiplication
                    System.out.println(number + " * " + i + " = " + (i * number));
                }
                i++;
            }
        }

        input.close();
    }
}
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.println();
        System.out.print("Enter a number from 1 to 5: ");
        number = input.nextInt();
        System.out.println();

        switch(number){
            case 1: 
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Value other than 1 to 5 entered");
        }
        System.out.println();
        input.close();
    }
}

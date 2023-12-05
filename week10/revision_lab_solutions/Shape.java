import java.util.Scanner;
public class Shape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println();
        System.out.print("What shape would you like to print out?");
        System.out.println();
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println();
        System.out.print("Enter your choice (1 or 2): ");
        choice = input.nextInt();
        System.out.println();
        switch(choice){
            case 1:
                System.out.println(" * * * *");
                System.out.println(" * * * *");
                System.out.println(" * * * *");
                System.out.println(" * * * *");
                break;
            case 2:
                System.out.println("       *");
                System.out.println("     * * * ");
                System.out.println("   * * * * *");
                System.out.println(" * * * * * * *");
                break;
            default:
                System.out.println("Invalid choice - can't print a shape");
        }
        System.out.println();
        input.close();
    }   
}

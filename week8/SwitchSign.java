import java.util.Scanner;
public class SwitchSign{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number from 1 to 3: ");
        number = input.nextInt();

        switch(number){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");   
                break; 
            default:
                System.out.println("invalid");
        }
        input.close();
    }
}

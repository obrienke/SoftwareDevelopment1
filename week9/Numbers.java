import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter number: ");
        num = input.nextInt();
        //exercise 8
        if(num >= 10 && num <= 20){
            System.out.println("In range");
        }else{
            System.out.println("Not in range");
        }
        //exercise 9
        if(num == 2 || num == 4){
            System.out.println("Valid - 2 or 4 allowed");
        }else{
            System.out.println("Invalid - must be 2 or 4");
        }

        //ignore
        switch(num){
            case 3:
                System.out.println("Correct");
                break;
            case 1:
            case 2:
            case 4:
                System.out.println("Incorrect");
                break;
            default:
                System.out.println("Invalid");   
        }
        input.close();
    }
}

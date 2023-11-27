import java.util.Scanner;

public class Decisions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = 0;

        // if / else    
        System.out.print("Enter a number: ");
        x = input.nextInt();
        if(x > 100){
            System.out.println("Number entered is greater than 100");
        }else{
            System.out.println("Number entered is NOT greater than 100");
        }

        // cascading if / else
        if(x > 0){
            System.out.println("positive");
        }else if(x < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }

        // switch statement
        System.out.print("Enter 1, 2, or 3: ");
        x = input.nextInt();
        switch(x){
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

        // conditional OR (||)    
        if((x == 1) || (x == 2) || (x == 3)){
            System.out.println("Valid");
            if(x == 1){
                System.out.println("one");
            }else if(x == 2){
                System.out.println("two");
            }else{
                System.out.println("three");
            }
        }else{
            System.out.println("Invalid");
        }

        // conditional AND (&&)
        System.out.print("Enter a number from 1 to 100: ");
        x = input.nextInt();
        if((x >= 1) && (x <= 100)){
            System.out.println("in range");
        }else{
            System.out.println("not in range");
        }

        input.close();        
    }
}
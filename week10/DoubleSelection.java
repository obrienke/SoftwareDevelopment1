import java.util.Scanner;
public class DoubleSelection{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if(number == 1){
            System.out.println("Number entered was 1");
        }else{
            System.out.println("Number entered was not 1");
        }

        System.out.print("Enter another number: ");
        number = input.nextInt();
        if(number == 1){
            System.out.println("Number entered was 1");
        }else if(number == 2){
            System.out.println("Number entered was 2");
        }else if(number == 3){
            System.out.println("Number entered was 3");
        }else{
            System.out.println("Number entered was not 1, 2, or 3");
        }

        // rewrite the cascading if/else as a switch
        switch(number){
            case 1:
                System.out.println("case: Number entered was 1");
                break;
            case 2:
                System.out.println("case: Number entered was 2");
                break;
            case 3:
                System.out.println("case: Number entered was 3");  
                break;
            default:
                System.out.println("case: Number entered was not 1, 2, or 3");  
        }

        if(number != 3){
            if(number == 2){
                System.out.println("Number entered was 2");
            }else{
                System.out.println("Number entered was not 2"); 
            }
        }

        int num1 = 1;
        int num2 = 2;

        if(num1 == 1 && num2 == 2){
            System.out.println("ok");
        }else{
            System.out.println("not ok");
        }

        num1 = 100;
        num2 = 200;

        if(num1 == 100 || num2 == 100){
            System.out.println("yes, one of them is a 100");
        }else{
            System.out.println("no, none of them are 100");
        }

        int num3 = 1;
        int num4 = 2;
        if(num1 == 100 || num2 == 100 || (num3 == 1 && num4 == 2)){
            System.out.println("yes, one of them is a 100");
        }else{
            System.out.println("no, none of them are 100");
        }

        input.close();
    }
}
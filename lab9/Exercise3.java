import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0;
        System.out.print("Enter number: ");
        number1 = input.nextInt();
        System.out.print("Enter another number: ");
        number2 = input.nextInt();
        if((number1 == 4 && number2 == 2) || (number1 == 2 && number2 == 4)){
            System.out.println("Numbers 4 and 2 entered");
        }else if(number1 == 2 || number1 == 4){
            System.out.println(number1 + "  entered");
        }else if(number2 == 2 || number2 == 4){
            System.out.println(number2 + "  entered");
        }else{
            System.out.println("Numbers 4 and 2 NOT entered");
        }
        input.close();
    }
}

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number >= 7 && number <= 14){
            number = number + 7;
        }else if(number >= 21 && number <= 28){
            number = number + 21;
        }else if(number >= 42 && number <= 49){
            number = number + 42;
        }else{
            number = number + 1;
        }
        System.out.println();
        System.out.println("Number updated to: " + number);
        input.close();
    }
}

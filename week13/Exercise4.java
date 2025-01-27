import java.util.Scanner;
public class Exercise4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print(number + " is updated to ");
        if(number > 1 && number < 5){
            number = number + 1;
        }else if(number > 21 && number < 25){
            number = number + 2;
        }else if(number > 41 && number < 45){
            number = number + 3;
        }else{
            number = number * 2;
        }
        System.out.println(number);

        input.close();
    }
}
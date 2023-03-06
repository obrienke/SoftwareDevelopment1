import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextInt();

        if(number > 10 && number < 20){
            number += 10;
        }else if(number > 30 && number < 40){
            number += 30;
        }else if(number > 50 && number < 60){
            number += 50;
        }else{
            number += 100;
        }
        System.out.println(number);
        input.close();
    }
}
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
       
        System.out.print("Enter number: ");
        number = input.nextInt();
        
        if(number >= 5 && number <= 10){
            number += 10;
        }else if(number >= 15 && number <= 20){
            number += 20;
        }else if(number >= 25 && number <= 30){
            number += 30;
        }else if(number >= 35 && number <= 40){
            number += 40;
        }else if(number >= 45 && number <= 50){
            number += 50;
        }else{
            number += 5;
        }

        System.out.println("Number updated to: " + number);
        input.close();
    }
}

import java.util.Scanner;
public class Guess2{
    public static void main(String[] args) {
        int number = 10;
        int guess = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int again = 1;

        while(again == 1){
            while(flag){
                count++;
                System.out.print("Guess the number: ");
                guess = input.nextInt();
                if(guess == number){
                    flag = false;
                }
            }
            System.out.print("Good guess. The number is " + number + ". It took you " + count);
            if(count == 1){
                System.out.println(" guess.");
            }else{
                System.out.println(" guesses.");
            }
            System.out.print("Play again (1 for yes, 2 for no): ");
            again = input.nextInt();
            if(again == 1){
                flag = true;
                count = 0;
            }
            number += 4;
        }
        System.out.println("Game over");
        input.close();
    }
}
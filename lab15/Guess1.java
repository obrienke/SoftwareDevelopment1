import java.util.Scanner;
public class Guess1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 5, guess = 0, count = 0;
        do{
            System.out.print("Guess a number: ");
            guess = input.nextInt();
            count++;
        }while(number != guess);

        System.out.println("Correct. Number is " + number + ". You took " + count + " attempts");
        input.close();
    }
}

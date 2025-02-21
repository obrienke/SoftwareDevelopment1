import java.util.Scanner;

public class Seconds{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int minutes = 0;
        System.out.print("Enter number of minutes: ");
        minutes = input.nextInt();
        for(int seconds = minutes * 60; seconds > 0; seconds--){
            System.out.print(seconds + " ");
        }
        System.out.println();
        input.close();
    }
}
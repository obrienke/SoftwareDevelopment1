import java.util.Scanner;
public class Small {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int small = 101;
        for(int i = 1; i <= 5; i++){
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();
            if(number < small){
                small = number;
            }
        }
        System.out.println("Smallest number entered is: " + small);
        input.close();
    }   
}

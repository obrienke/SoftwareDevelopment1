import java.util.Scanner;
public class Seconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = 0;
        int minutes = 0;
        System.out.print("Enter minutes: ");
        minutes = input.nextInt();
        seconds = minutes * 60;
        for(int i = seconds; i >= 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        input.close();
    } 
}

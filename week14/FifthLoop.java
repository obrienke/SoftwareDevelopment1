import java.util.Scanner;
public class FifthLoop{
    public static void main(String[] args) {
        int x = 1;
        Scanner input = new Scanner(System.in);
        int numberOfLoops = 0;

        System.out.print("How many times do you want to loop: ");
        numberOfLoops = input.nextInt();
        while(x <= numberOfLoops){
            System.out.println("Loop counter: " + x);
            x++;
        }
        input.close();
    }
}
 
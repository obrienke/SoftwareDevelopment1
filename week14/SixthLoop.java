import java.util.Scanner;
public class SixthLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLoops = 0;

        System.out.print("How many times do you want to loop: ");
        numberOfLoops = input.nextInt();
        if(numberOfLoops < 5){
            while(numberOfLoops < 5){
                System.out.println("Loop counter: " + numberOfLoops);
                numberOfLoops++;
            }
        }
        
        input.close();
    }
}
 
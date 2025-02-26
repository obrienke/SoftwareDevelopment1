import java.util.Scanner;
public class LoopCount{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        int flag = 0;

        System.out.print("Want to loop: (0 for yes, any other number for no): ");
        if(input.nextInt() != 0){
            flag = 1;
        }

        while(flag == 0){
            System.out.print("Loop again (0 for yes, any other number for no): ");
            if(input.nextInt() != 0){
                flag = 1;
            }
            count++;
        }

        System.out.println("You looped " + count + " times.");
        input.close();
    }
}
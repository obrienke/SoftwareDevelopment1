import java.util.Scanner;
public class LoopCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, flag = 0;
        System.out.print("Want to loop: Enter 0 for yes, 1 for no: ");
        if(input.nextInt() != 0){
            flag = 1;
        }
        while(flag == 0){
            System.out.print("Loop again: Enter 0 for yes, 1 for no: ");
            if(input.nextInt() != 0){
                flag = 1;
            }  
            count++;  
        }
        System.out.println("You looped " + count + " times.");
        input.close();
    }    
}

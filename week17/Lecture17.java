import java.util.Scanner;
public class Lecture17{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // list variables
        int counter = 0;
        int flag = -1;

        // inputs required
        System.out.print("Enter iteration (-1 for no, any other number for yes)? ");
        flag = input.nextInt();

        // if / else, and/or loops
        while(flag != -1){
            counter++;
            System.out.print("Iteration again (-1 for no, any other number for yes)? ");
            flag = input.nextInt();
        }
       
        // outputs
        System.out.println("Code inside while loop executed " + counter + " times.");

    
        System.out.print("How many times do you want the loop to run: ");
        counter = input.nextInt();
        int i = 1;
        while(counter >= i){
            System.out.println(i + ". Loop executed");
            i++;
        }

        input.close();
    }
}

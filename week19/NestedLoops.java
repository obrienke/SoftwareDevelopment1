import java.util.Scanner;
public class NestedLoops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Basic counter controlled loop");
        for(int i = 1; i <= 5; i++){
            System.out.println("Iteration " + i);
        }
        System.out.println();

        System.out.println("Counter loop with nested logic - example 1");
        for(int i = 1; i <= 5; i++){
            if(i == 1 || i == 3 || i == 5){
                System.out.println("Iteration " + i);
            }
        }
        System.out.println();

        System.out.println("Sentinel Loop");
        int count = 0;
        while(count == 0){
            System.out.print("Enter 0 to continue: ");
            count = input.nextInt();
        }
        System.out.println();

        System.out.println("Counter loop with nested logic - example 2");
        /*
         * A table with 2 rows and 3 columns:
         * 1 2 3
         * 1 2 3
         * Loop twice for rows, and loop 3 times for columns
         */
        for(int rows = 1; rows <= 2; rows++){
            System.out.print("Row " + rows + ": ");
            for(int cols = 1; cols <= 3; cols++){
                System.out.print(cols + " ");
            }
            System.out.println();
        }

        System.out.println("Counter loop with nested logic - example 3");
        /* Iterate data more than once - examples where you would do this is with machine or reinforcement learning*/
        for(int runs = 1; runs <= 2; runs++){
            System.out.println("Run " + runs);
            for(int rows = 1; rows <= 2; rows++){
                System.out.print("Row " + rows + ": ");
                for(int cols = 1; cols <= 3; cols++){
                    System.out.print(cols + " ");
                }
                System.out.println();
            }
        }
        
        input.close();
    }
}
import java.util.Scanner;
public class NestedLoops{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Basic counter loop");
        for(int i = 1; i <= 5; i++){
            System.out.println("Loop " + i);
        }
        System.out.println();

        System.out.println("Counter loop with nested logic - example 1");
        for(int i = 1; i <= 5; i++){ // note int i declared again: This is ok, as its a local variable. 
            if(i == 1 || i == 3 || i == 5){
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Sentinel Loop");
        int count = 0;
        while(count == 0){
            System.out.print("Enter 0 to continue: ");
            count = kb.nextInt();
        }
        System.out.println();

        System.out.println("Counter loop with nested logic - example 2");
        /* 
        A table, 2 rows, 3 columns:

        1 2 3
        1 2 3   
        
        loop twice for rows, loop 3 times for columns
        outer loop for rows, inner loop for columns
        */
        for(int i = 1; i <= 2; i++){ 
            System.out.println("row " + i);
            for(int j = 1; j <= 3; j++){
                System.out.println("column " + j);
            }
        }
        System.out.println();
        for(int i = 1; i <= 2; i++){ 
            for(int j = 1; j <= 3; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Counter loop with nested logic - example 3");
        /* 
         From previous example, but iterate all the rows and columns more than once. 
         Example where you would find this - nested to 3 levels: Machine Learning and Batch processing a number of files
        */
        for(int i = 1; i <= 2; i++){ 
            System.out.println("Iteration " + i);
            for(int j = 1; j <= 4; j++){
                System.out.println("row " + j);
                for(int k = 1; k <= 3; k++){
                    System.out.println("column " + k);    
                }
            }
            System.out.println();
        }
        System.out.println();

        kb.close();
    }

}
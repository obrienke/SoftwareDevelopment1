import java.util.Scanner;
public class NestedLoops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Basic Counter Controlled Loop");
        for(int i = 1; i <= 5; i++){
            System.out.println("Loop " + i);
        }
        System.out.println("Counter Controlled Loop with nested logic");
        for(int i = 1; i <= 5; i++){
            if(i == 1 || i == 3 || i == 5){
                System.out.println("Loop " + i);
            }
        }
        System.out.println("Sentinel Loop");
        int count = 0;
        while(count == 0){
            System.out.print("Enter 0 to continue: ");
            count = input.nextInt();
        }
        System.out.println("Nested Loops");
        /*
            1 2 3
            1 2 3
        */   
        for(int i = 1; i <= 2; i++){ // rows
            for(int j = 1; j <= 3; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i = 1; i <= 2; i++){ // rows
            System.out.print("row " + i + ": ");
            for(int j = 1; j <= 3; j++){
                System.out.print("column" + j + " ");
            }
            System.out.println();
        }
        for(int i = 1; i <= 3; i++){ // rows
            for(int j = 1; j <= 3; j++){
                System.out.print("row " + i + " column" + j + " ");
            }
            System.out.println();
        }
        for(int i = 1; i <= 2; i++){
            System.out.println("File " + i);
            for(int j = 1; j <= 3; j++){
                System.out.println("Row " + j);
                for(int x = 1; x <= 3; x++){
                    System.out.println("Column " + x);
                }
            }
            System.out.println();
        }
        input.close();
    }
}
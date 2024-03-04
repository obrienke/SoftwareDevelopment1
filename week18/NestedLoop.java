import java.util.Scanner;
public class NestedLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // counter controlled loop
        for(int i = 1; i <= 5; i++){
            System.out.println("Line " + i);
        }

        // sentinel loop
        int flag = 0;
        while(flag == 0){
            System.out.print("Run again (0 for yes): ");
            flag = input.nextInt();
        }

        //nested loop for processing rows/columns
        // row 1: column 1 column 2 column 3 column 4
        // row 2: column 1 column 2 column 3 column 4
        for(int i = 1; i <= 3; i++){ // outer loop for processing rows
            System.out.print("row " + i + ": ");
            for(int j = 1; j <= 4; j++){ // inner loop for processing columns
                System.out.print("column " + j + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
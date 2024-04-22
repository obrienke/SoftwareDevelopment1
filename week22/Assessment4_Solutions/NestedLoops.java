public class NestedLoops {
    public static void main(String[] args) {
        System.out.println("\nPart a:\n");
        //part 1 - 5 marks
        int rows = 6; // Change this value to adjust the number of rows
        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for each row, printing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }

        //part 2 - 7 marks   
        System.out.println("\nPart b:\n");
        int counter = 10; //first value to print on each row
        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for each row, printing numbers from 10 to (10 + (i-1))
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
            counter = 10; // reset for next row to start back at 10.
        }

        //part 3 - 8 marks
        System.out.println("\nPart c:\n");
        counter = 10;
        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for each row, printing numbers from 10 to (10 + (j + (i-1)))
            for (int j = 6; j >= i; j--) {
                System.out.print(counter++ + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
            counter = 10; // reset for next row to start back at 10.
        }
        System.out.println();
    }
}
import java.util.Scanner;
public class LineNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNumber = 0;
        String sentence = "";

        System.out.print("Enter a line number: ");
        lineNumber = input.nextInt();

        input.nextLine(); //Consume the Carriage Return(Enter Key) from previous nextInt.

        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();

        System.out.println(lineNumber + ". " + sentence);

        input.close();
    }
}

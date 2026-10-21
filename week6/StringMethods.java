import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;

        // part 1.
        System.out.print("Enter a word: ");
        word = input.next();
        System.out.println(word + " contains " + word.length() + " characters.");
        //part 2.
        System.out.println("First character is " + word.charAt(0) + " and last character is " + 
                            word.charAt(word.length() - 1));
        //part 3.
        char second = word.charAt(1);
        System.out.println("Second character: " + second);
        int index = word.indexOf(second);
        System.out.println("In " + word + " second character is " + second);
        System.out.println("Is is found at index: " + index);
        System.out.println("Second character: " + word.charAt(index));

        input.close();
    }
}

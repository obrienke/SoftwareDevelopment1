/* This class includes solutions for the following exercises:
 * Exercise 2
 * Exercise 3
 * Exercise 4
 * Exercise 5
 * From Java Lab 4
 */
import java.util.Scanner;
public class StringExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        char first;
        System.out.print("Enter word: ");
        word = input.next();
        first = word.charAt(0);
        System.out.println("First character of " + word + " is " + first);
        System.out.println("Second character of " + word + " is " + word.charAt(1));
        System.out.println("Last character of " + word + " is " + word.charAt(word.length() - 1));

        word = "Software";
        System.out.println("Word from first 4 characters of " + word + " is " + word.substring(0, 4));

        word = "axtxmn";
        System.out.println(word + " update to " + word.replace('x', 'u'));
        input.close();
    }
}

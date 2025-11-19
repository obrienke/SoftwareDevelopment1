/*
Character is a class in the java.lang package provided by the Java standard library. 
It is a wrapper class for the primitive type char and contains many static utility 
methods for working with characters.
Note: It does not need to be imported.
*/

import java.util.Scanner;
public class CharacterType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        boolean other = true;

        System.out.print("Enter a single character: ");
        ch = input.next().charAt(0);

        if(Character.isDigit(ch)){
            System.out.println("You entered a digit");
            other = false;
        }
        if(Character.isLetter(ch)){
            System.out.println("You entered a letter");
            other = false;
        }
        if(other){
            System.out.println("You entered a value which is not a digit or a letter");
        }
        input.close();
    }
}

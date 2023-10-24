import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        char letter;
        String word;

        System.out.println("==============");
        System.out.println("Requirement 1:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter a word: ");
        word = input.next();

        System.out.println("Number of characters in "+word+" is: "+word.length());

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 2:");
        System.out.println("==============");
        System.out.println();
        System.out.println("First character of "+word+" is: "+word.charAt(0));
        System.out.println("Last character of "+word+" is: "+word.charAt(word.length() - 1));
        
        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 3:");
        System.out.println("==============");
        System.out.println();

        System.out.println("Second character "+word.charAt(1)+" is located at index "+ word.indexOf(word.charAt(1)));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 4:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter a character to check if its contained in the word you previously entered: ");
        letter = input.next().charAt(0);
        System.out.println("This character is located at index: "+word.indexOf(letter)+". Note: if index value of -1, \""+word+"\" does not contain '"+letter+"'.");

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 5:");
        System.out.println("==============");

        System.out.println();
        System.out.print("Enter firstname: ");
        String fn = input.next();
        System.out.print("Enter surname: ");
        String sn = input.next();
        System.out.println("Name entered is: "+fn.concat(" ").concat(sn));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 6:");
        System.out.println("==============");

        //check if two strings match
        System.out.println();
        System.out.println("Check if strings match");
        System.out.print("Enter first string: ");
        String fs = input.next();
        System.out.print("Enter second string: ");
        String ss = input.next();
        System.out.println(fs+" matches "+ss+": "+fs.equals(ss));
        System.out.println(fs+" matches (ignore case) "+ss+": "+fs.equalsIgnoreCase(ss));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 7:");
        System.out.println("==============");

        //create a substring from the 1st character to 3rd character
        System.out.println();
        System.out.println("create a substring from the 1st character to 3rd character");
        System.out.print("Enter a string to create substring from: ");
        String sub = input.next();
        System.out.println("Substring from 1st to 3rd character of "+sub+" is: "+sub.substring(0, 3));

        System.out.println();
        System.out.println("==============");
        System.out.println("Requirement 8:");
        System.out.println("==============");

        System.out.println();
        System.out.println("Enter a string, and if it contains any 'u' characters replace them with 'x' characters");
        System.out.print("Enter a string: ");
        String rs = input.next();
        
        System.out.println(rs+" updated with 'u' characters(if they exist in the string) replaced by 'x' characters: "+rs.replace('u', 'x'));    
        input.close();
    }
}

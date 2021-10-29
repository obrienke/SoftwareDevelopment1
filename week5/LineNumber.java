import java.util.Scanner;
public class LineNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String s;

        System.out.print("Enter a line number: ");
        x = sc.nextInt();
        sc.nextLine(); // required workaround - see comment below this class
        System.out.print("Enter a sentence: ");
        s = sc.nextLine();

        System.out.println(x + ". "+s);
        sc.close();
    }
}

/*
if you have a nextInt which is followed by another prompt for a string which uses nextLine, then you can't enter at that second prompt. Here is why:

That's because the Scanner.nextInt() method does not read the newline character in your input created by hitting "Enter," 
and so the call to Scanner.nextLine() returns after reading that newline.

You will encounter the similar behaviour when you use Scanner.nextLine after Scanner.next() or any Scanner.next method (except nextLine itself).

Workaround:

Either put a Scanner.nextLine call after each Scanner.nextInt or any Scanner.next method to consume rest of that line including newline.

or 

Or, read the input through Scanner.nextLine and convert your input to the proper format you need. 
For example, you may convert to an integer using Integer.parseInt(String) method.
*/
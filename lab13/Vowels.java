/* 
    1. Prompt user to enter some text
    2. Check what vowels are contained in that text and print them to the screen
    vowel: a, e, i, o, u
*/
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "";
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
        System.out.print("Enter text: ");
        text = input.nextLine();
        System.out.println(text + " contains the following vowels: ");
        for(int i = 0; i < text.length(); i++){
            if(text.toLowerCase().charAt(i) == 'a' && aCount == 0){
                aCount++;
                System.out.println("a");
            }else if(text.toLowerCase().charAt(i) == 'e' && eCount == 0){
                eCount++;
                System.out.println("e");
            }else if(text.toLowerCase().charAt(i) == 'i' && iCount == 0){
                iCount++;
                System.out.println("i");
            }else if(text.toLowerCase().charAt(i) == 'o' && oCount == 0){
                oCount++;
                System.out.println("o");
            }else if(text.toLowerCase().charAt(i) == 'u' && uCount == 0){
                uCount++;
                System.out.println("u");
            }
        } 
        input.close();
    }    
}

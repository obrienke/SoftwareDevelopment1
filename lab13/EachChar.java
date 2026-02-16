import java.util.Scanner;
public class EachChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "";
        System.out.print("Enter some text: ");
        text = input.nextLine();
        System.out.println("Characters in " + text + " are:");
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) != ' ')
                System.out.println(text.charAt(i));
        }     
        input.close();
    }
}

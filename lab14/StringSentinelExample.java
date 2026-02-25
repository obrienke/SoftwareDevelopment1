import java.util.Scanner;
public class StringSentinelExample {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       String input;
       System.out.println("Type anything, or type 'quit' to exit");
       do{
            System.out.print("Enter text: ");
            input = kb.nextLine();
            if(!input.equalsIgnoreCase("quit")){
                System.out.println("You typed: " + input);
            }
       }while(!input.equalsIgnoreCase("quit"));
       kb.close();
    }
}

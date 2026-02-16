import java.util.Scanner;
public class Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "";
        char letter = 'x';
        int count = 0;

        System.out.print("Enter some text: ");
        text = input.nextLine();
        System.out.print("Enter a character: ");
        letter = input.next().charAt(0);

        System.out.print("The " + letter + " appears in " + text + " ");
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == letter){
                count++;
            }
        }
        if(count == 1){
            System.out.println("once."); 
        }else{
            System.out.println(count + " times.");
        }
        System.out.println(count + " times.");
        input.close();
    }
}

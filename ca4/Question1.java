import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int max = 11;
        String text = "";
        System.out.print("Enter some text: ");
        text = input.nextLine();
        for(int i = 1; i <= max; i++){
            System.out.println(i + ". " + text);
        }
        input.close();
    }
}

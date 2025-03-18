import java.util.Scanner;

public class Question1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text  = "";
        System.out.print("Enter some text: ");
        text = input.nextLine();

        for(int i = 1; i <= 12; i++){
            System.out.println(i + ". " + text);
        }
        input.close();
    }
}

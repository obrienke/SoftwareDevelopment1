import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //System.out.println("Exercise 1");
        String text = "";
        System.out.print("Enter some text: ");
        text = input.nextLine();

        //System.out.println(text);
        for(int i = 1; i <= 4; i++){
            System.out.println(text + " " + i);
        }
        input.close();
    }
}


import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter number: ");
        number = kb.nextInt();
        if(number > 5 && number < 12){
            number -= 5;
        }else if(number > 25 && number < 32){
            number -= 25;
        }else if(number > 45 && number < 52){
            number -= 45;
        }else{
            number -= 2;
        }
        System.out.println("Number updated to: " + number);
        kb.close();
    }
}

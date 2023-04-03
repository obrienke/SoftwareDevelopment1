import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter number: ");
        number = kb.nextInt();
        if(number > 20 && number < 30){
            number += 10;
        }else if(number > 50 && number < 60){
            number += 20;
        }else{
            number += 30;
        }
        System.out.println("Number updated to: " + number);
        kb.close();
    }
}

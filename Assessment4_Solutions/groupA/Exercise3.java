import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
       
        System.out.print("Enter number: ");
        number = input.nextInt();
        
        if(number >= 4 && number <= 8){
            number *= 6;
        }else if(number >= 10 && number <= 14){
            number *= 12;
        }else if(number >= 16 && number <= 20){
            number *= 18;
        }else if(number >= 22 && number <= 26){
            number *= 24;
        }else{
            number *= 3;
        }

        System.out.println("Number updated to: " + number);
        input.close();
    }
}

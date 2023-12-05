// exercise 4
import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wage = 0;
        char grade = 'X';

        System.out.print("Enter wage: ");
        wage = input.nextDouble();
        System.out.print("Enter grade (A, B or C): ");
        grade = input.next().toUpperCase().charAt(0);
        
        switch(grade){
            case 'A':
                wage += 100;
                break;
            case 'B':
                wage += 50;
                break;
            case 'C':
                wage += 10;
        }

        System.out.println("Wages with bonus: " + wage);
        input.close();
    }
}

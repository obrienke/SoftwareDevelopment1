import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char symbol = 'x';

        System.out.print("Enter a symbol: ");
        symbol = input.next().charAt(0);

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        input.close();
    }
}

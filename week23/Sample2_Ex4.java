import java.util.Scanner;
public class Sample2_Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char symbol;

        System.out.print("Enter symbol: ");
        symbol = input.next().charAt(0);

        for(int row = 0; row < 4; row++){
            for(int col = 1; col <= 5; col++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        input.close();
    }
}

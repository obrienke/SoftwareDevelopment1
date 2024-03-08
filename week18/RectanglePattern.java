import java.util.Scanner;
public class RectanglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = 0;
        int c = 0;

        System.out.print("Enter rows: ");
        r = input.nextInt();
        System.out.print("Enter cols: ");
        c = input.nextInt();
        for(int rows = 1; rows <= r; rows++){
            for(int cols = 1; cols <= c; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}

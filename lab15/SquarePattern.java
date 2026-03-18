import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int size = 0;
       System.out.print("Enter size: ");
       size = input.nextInt();
       int i = 1, j = 1;
       System.out.println();
       while(i <= size){
        j = 1;
        while(j <= size){
            System.out.print("* ");
            j++;
        }
        System.out.println();
        i++;
       } 
       input.close();
    }
}

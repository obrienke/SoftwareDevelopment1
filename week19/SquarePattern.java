import java.util.Scanner;
public class SquarePattern{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter the size: ");
        size = input.nextInt();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print("* ");    
            }
            System.out.println();
        }
        input.close();
    }
}
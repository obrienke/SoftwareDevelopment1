import java.util.Scanner;
public class Rectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int length = -1, width = -1;
        while(length > 20 || length < 0){
            System.out.print("Enter the length: ");
            length = input.nextInt();
        }
        do{
            System.out.print("Enter the width: ");
            width = input.nextInt();
        }while(width > 20 || width < 0);

        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                System.out.print("* ");    
            }
            System.out.println();
        }
        input.close();
    }
}
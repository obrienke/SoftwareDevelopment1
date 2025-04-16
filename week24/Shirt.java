import java.util.Scanner;
public class Shirt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter a shirt size: ");
        size = input.nextInt();
        if(size == 42 || size == 41){
            System.out.println("Large");
        }else if(size == 40 || size == 39){
            System.out.println("Medium");
        }else if(size == 38 || size == 37){
            System.out.println("Small");
        }else{
            System.out.println("None");
        }
        input.close();
    }
}

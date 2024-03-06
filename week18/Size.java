import java.util.Scanner;
public class Size {
    public static void main(String[] args) {
        int size = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        size = input.nextInt();

        if(size > 70 && size <= 100){
            System.out.println("Go for large size");
        }else if(size > 35 && size <= 70){
            System.out.println("Go for medium size");
        }else if(size > 10 && size <= 35){
            System.out.println("Go for small size");
        }else{
            System.out.println("Size not available");
        }
        input.close();
    }
}

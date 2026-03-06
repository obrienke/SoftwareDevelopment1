import java.util.Scanner;
public class Size {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter size: ");
        size = input.nextInt();
        if(size > 100 || size < 10){
            System.out.println("Size not available");
        }else if(size <= 100 && size > 70){
            System.out.println("Go for large size");
        }else if(size <= 70 && size > 35){
            System.out.println("Go for medium size");
        }else{
            System.out.println("Go for small size");
        }
        input.close();
    }
}

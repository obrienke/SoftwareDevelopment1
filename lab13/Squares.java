import java.util.Scanner;
public class Squares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0, count = 0;
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        System.out.print("perfect square numbers between " + a + " and " + b + ": ");
        for(int i = 1; i * i <= b; i++){
            if(i * i >= a){
                System.out.print((i * i) + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total: " + count);
        input.close();    
    }
}

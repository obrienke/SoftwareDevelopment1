import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.print("Enter value for a: ");
        a = input.nextInt();
        System.out.print("Enter value for b: ");
        b = input.nextInt();
        System.out.print("Enter value for c: ");
        c = input.nextInt();
        System.out.print("Enter value for d: ");
        d = input.nextInt();
        System.out.print("Enter value for e: ");
        e = input.nextInt();
        System.out.println("a updated to " + (a += 9));
        System.out.println("b updated to " + (b -= 4));
        System.out.println("c updated to " + (c *= 3));
        System.out.println("d updated to " + (d /= 2));
        System.out.println("e updated to " + (e %= 5));
        input.close();
    }
}

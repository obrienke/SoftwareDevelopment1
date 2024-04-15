import java.util.Scanner;
public class Lecture{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lecture lecture = new Lecture();
        int x = 1;
        int y = 1;
        
        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        int result = lecture.sum(x, y);
        System.out.println(result);
        System.out.println(product(5,7));
        input.close();
    }

    public int sum(int x, int y){
        int result = x + y;
        return result;
    }
    public static int product(int x, int y){
        return x * y;
    }
}
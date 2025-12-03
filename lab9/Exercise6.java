import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1 = 0,side2 = 0, side3 = 0;
        System.out.println("Enter lengths for 3 sides of triangle:");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();
        if((side1 == side2) && (side1 == side3)){
            System.out.println("Equilateral");
        }else if((side1 == side2) || (side1 == side3) || (side2 == side3) ){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
        input.close();
    }
}

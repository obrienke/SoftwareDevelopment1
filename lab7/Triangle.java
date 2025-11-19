import java.util.Scanner; 
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1, side2, side3, valid = 0;
        System.out.println("Enter lengths of 3 sides of a triangle");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();

        if(side1 + side2 > side3){
            valid = valid + 1;
        }
        if(side1 + side3 > side2){
            valid = valid + 1;
        }
        if(side2 + side3 > side1){
            valid = valid + 1;
        }

        if(valid == 3){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
        input.close();
    }
}

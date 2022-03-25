public class Triangle4{
    public static void main(String[] args) {
        for(int rows = 1; rows <= 10; rows++){
            //print the spaces
            for(int spaces = 9; spaces >= rows; spaces--){
                System.out.print(" ");
            }
            //print the stars
            for(int stars = 1; stars <= rows; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

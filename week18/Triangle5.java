public class Triangle5{
    public static void main(String[] args) {
        for(int rows = 1; rows <= 9; rows++){
            //print the spaces
            for(int spaces = 9; spaces >= rows; spaces--){
                System.out.print(" ");
            }
            //print the stars
            for(int stars = 1; stars <= (rows * 2) -1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

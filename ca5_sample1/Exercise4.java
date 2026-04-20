public class Exercise4 {
    public static void main(String[] args) {
        int number = 10;
        for(int rows = 1; rows <= 4; rows++){
            for(int cols = 1; cols <= 4; cols++){
                System.out.print(number + " ");
                number += 2;
            }
            System.out.println();
        }
    }
}

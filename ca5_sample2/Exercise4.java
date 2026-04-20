public class Exercise4 {
    public static void main(String[] args) {
        char symbol = '$';
        for(int rows = 1; rows <= 4; rows++){
            for(int cols = 1; cols <= 5; cols++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}

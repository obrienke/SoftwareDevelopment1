public class Exercise4{
    public static void main(String[] args) {
        int number = 8;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(" "+(number += 2));
            }
            System.out.println();
        }
    }
}
public class Exercise4{
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            for(int j = 2; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 9 - (i * 3); k <= 9; k += 3){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
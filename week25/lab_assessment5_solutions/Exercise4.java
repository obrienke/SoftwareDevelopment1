public class Exercise4{
    public static void main(String[] args) {
        System.out.println("\n### Part a. ###\n");
        for(int i = 8; i >= 2; i -= 2){
            System.out.print(i + " ");
        }
        System.out.println("\n\n### Part b. ###\n");
        for(int i = 0; i < 4; i++){
            for(int j = 3; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 8 - (i * 2); k <= 8; k += 2){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
public class Question5 {
    public static void main(String[] args) {
        System.out.println("Part a:\n------\n");
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print("r" + i + "c" + j + " ");
            }
            System.out.println();
        }
        System.out.println("\nPart b:\n------\n");
        for(int i = 4; i >= 1; i--){
            for(int j = 5; j >= 1; j--){
                System.out.print("r" + i + "c" + j + " ");
            }
            System.out.println();
        }
    }
}

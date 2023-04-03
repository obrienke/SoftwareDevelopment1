public class Exercise4 {
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++){
            System.out.print(i + ": ");
            int j = 0;
            for(j = 8; j > 2; j -= 2){
                System.out.print(j + ", ");
            }
            System.out.print(j);
            System.out.println();
        }
    }
}

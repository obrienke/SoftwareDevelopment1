public class SampleEx4 {
    public static void main(String[] args) {
        int number = 8;
        for(int i = 0; i < 4; i++){
            for(int j = 1; j <= 4; j++){
                number = number + 2;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

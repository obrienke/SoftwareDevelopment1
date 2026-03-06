public class Five {
    public static void main(String[] args) {
        for(int i = 5; i <= 50; i += 5){
            System.out.print(i);
            if(i < 50){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

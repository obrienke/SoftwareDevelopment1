public class Exercise5{
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.print(i + ": ");
            for(int j = 8; j >= 2; j--, j--){
                System.out.print(j);
                if(j != 2){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
            
    }
}
public class Triangle1{
    public static void main(String[] args){
        // solution for exercise 10
        for(int i = 1; i <= 8; i++){
            for(int j = 0; j < i; j++){
                System.out.print("+");    
            }
            System.out.println();
        }

        System.out.println();
        // solution for exercise 11
        for(int i = 1; i <= 8; i++){
            for(int j = 8; j >= i; j--){
                System.out.print("+");    
            }
            System.out.println();
        }
    }
}

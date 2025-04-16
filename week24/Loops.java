public class Loops{
   public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 7; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1, j = 7; i <= 7 && j >= 1; i++, j--){
            System.out.print(i + " " + j + " ");
        }
        System.out.println();
        System.out.println();
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("X");
            }
            System.out.println();
        }
   } 
}

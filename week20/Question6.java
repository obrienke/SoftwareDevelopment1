public class Question6 {
    public static void main(String[] args) {
        System.out.println("Part a:");
        System.out.println("------");
        System.out.println();
        for(int row = 1; row <= 2; row++){
            System.out.print("line " + row + ": ");
            for(int cols = 1; cols <= 2; cols++){
                System.out.print(cols + " ");
            }
            System.out.println();
        }
        System.out.println("Part b:");
        System.out.println("------");
        System.out.println();
        int lines = 4;
        for(int i = 1; i <= lines; i++){
            for(int j = lines; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

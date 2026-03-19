public class InitArray3 {
    public static void main(String[] args) {
        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        int[][] y = {{1,2,3,4}, {10, 20}, {100}};

        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < y.length; i++){
            for(int j = 0; j < y[i].length; j++){
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
    } 
}

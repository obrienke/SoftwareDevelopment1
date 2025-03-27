public class TwoD_Array {
    public static void main(String[] args) {
        int[][] x = {{1, 3, 4}, {3, 100, 9}, {1, 2, 3, 4}};
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package week21;
public class FirstArray {
    public static void main(String[] args) {
        //FirstArray
        System.out.println("\nExercise 1:\n");
        int[] x;
        x = new int[4];
        for(int i = 0; i < x.length; i++){
            System.out.println("Element " + (i + 1) + ": " + x[i]);
        }

        //SecondArray
        System.out.println("\nExercise 2:\n");
        int[] y = {128, 132, 8, 156, 18};
        int idx = 0;
        while(idx < y.length){
            System.out.println("Element " + (idx + 1) + ": " + y[idx]);
            idx++;
        }
    }
}

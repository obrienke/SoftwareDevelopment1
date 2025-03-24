package week21;
public class SeventhArray {
    public static void main(String[] args) {
        int[] x = {100, 200, 300, 400, 500};
        int[] y = new int[x.length];

        for(int i = x.length - 1, idx = 0; i >= 0; i--, idx++){
            y[idx] = x[i];
        }

        System.out.println("Index\tBefore\tAfter");
        System.out.println("-----\t------\t-----\n");
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i] + "\t" + y[i]);
        }
    }
}


/* First Loop does the following:
 y[0] = x[4]
 y[1] = x[3]
 y[2] = x[2]
 y[3] = x[1]
 y[4] = x[0]
 */
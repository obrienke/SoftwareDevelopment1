public class InitArray2 {
    public static void main(String[] args) {
        int[] x = new int[10];
        outputArray(x);
        for(int i = 0, val = 1; i < x.length; i++, val++){
            x[i] = val;
        }
        outputArray(x);
        int[] y = {10, 20, 30, 40};
        outputArray(y);
        int[] z = new int[3];
        z[0] = 105;
        z[1] = 106;
        z[2] = 107;
        outputArray(z);
    }
    public static void outputArray(int[] array){
        System.out.println("\nIndex\tValue\n");
        for(int i = 0; i < array.length; i++){
            System.out.println(i + "\t" + array[i]);
        }  
    }
}

public class Exercise5_method {
    public static void main(String[] args) {
        int[] x = {100, 200, 300, 400};
        printArray(x);
        System.out.println();
        for(int i = 0; i < x.length; i++){
            x[i] *= 3;
        }
        printArray(x);
    }
    static void printArray(int[] x){
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }
    }
}

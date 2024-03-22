public class InitArray2{
    public static void main(String[] args) {
        int[] x = {32, 28, 97, 2, 87, 63, 56, 91, 44, 10};
        
        System.out.println("Index\tValue\n");

        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }
        System.out.println();
    }
}
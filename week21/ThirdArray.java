package week21;
public class ThirdArray {
    public static void main(String[] args) {
        int[] x = new int[5];
        for(int i = 0; i < x.length; i++){
            x[i] = i + 1;
        }

        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }

    }
}

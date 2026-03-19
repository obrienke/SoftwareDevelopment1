public class ThirdArray {
    public static void main(String[] args) {
        int[] x = new int[5];
        int i = 0, val = 0;
        System.out.println("Index\tValue\n");
        while(i < x.length){
            x[i] = ++val;
            System.out.println(i + "\t" + x[i]);
            i++;
        }
    }
}

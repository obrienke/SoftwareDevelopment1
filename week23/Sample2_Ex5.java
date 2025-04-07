public class Sample2_Ex5 {
    public static void main(String[] args) {
        int[] x = {20, 30, 40, 50};
        int total = 0;
        int product = 1;
        System.out.println("Index\tValue\n-----\t-----");
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
            total += x[i];
            product *= x[i];
        }
        System.out.println();
        System.out.println("Total: " + total);
        System.out.println("Product: " + product);
        System.out.println("Average: " + ((total * 1.0) / x.length));

    }
}

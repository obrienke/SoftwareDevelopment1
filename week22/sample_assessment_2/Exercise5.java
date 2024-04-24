public class Exercise5 {
    public static void main(String[] args) {
        int[] x = {20, 30, 40, 50};
        int total = 0;
        int product = 1;
        
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        
        for(int i = 0; i < x.length; i++){
            total = total + x[i];
            product = product * x[i];
            System.out.println(i + "\t" + x[i]);
        }

        System.out.println("Total: " + total);
        System.out.println("Product: " + product);
        System.out.println("Average: " + (total/x.length));
    }
}


public class Exercise5 {
    public static void main(String[] args) {
        
        int[] x = {20, 30, 40, 50};

        int product = 1;
        int sum = 0;
        
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
            sum += x[i];
            product *= x[i];
        }
        System.out.println();
        System.out.println("Total: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + (sum / x.length));
    }
}

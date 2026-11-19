public class PrintFormat2{
    public static void main(String[] args){
        int x = 4, y = 10;
        float a = 2.456f;
        String name = "Mary";

        System.out.printf("%d%n", 100);
        System.out.printf("%d and %d%n", x, y);
        System.out.printf("%d, %d, and %d%n", 100, x, y);
        System.out.printf("%f%n", a);
        System.out.printf("%.2f%n", a);
        System.out.printf("Name: %s%n", name);
 
        if(x > 2){
            System.out.printf("%d is greater than 2%n", x);
        }
    }
}
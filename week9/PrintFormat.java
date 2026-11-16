public class PrintFormat {
    public static void main(String[] args) {
        int x = 4;
        float y = 34.23789123f;
        String s = "A sentence";
        
        System.out.printf("number is %d", x);
        System.out.printf("number is %f", y);
        System.out.printf("%s", s);

        System.out.printf("%nnumber is %d%n", x);
        System.out.printf("number is %f%n", y);
        System.out.printf("%s%n", s);

        System.out.printf("numbers are %d and %f.%n%s%n", x, y, s);
        System.out.printf("numbers are %d and %.3f.%n", x, y);

        System.out.printf("Total is: €%,.2f%n", y);
    }
}

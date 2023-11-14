public class PrintExample{
    public static void main(String[] args) {
        System.out.printf("Using printf method%n");

        String name = "Kevin";
        System.out.printf("Name: %s%s%n", name, " O'Brien");

        double dblTotal = 23.435345;
        System.out.printf("Total: %-10.2f: %n", dblTotal); 

    }
}
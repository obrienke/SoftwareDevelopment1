public class Operators {
    public static void main(String[] args) {
        int x  = 100;
        System.out.println("Number: " + x); // Number: 100
        x += 5;
        System.out.println("Number: " + x); // Number: 105
        x++;
        System.out.println("Number: " + x); // Number: 106
        x--;
        System.out.println("Number: " + x); // Number: 105
        x -= 5;
        System.out.println("Number: " + x); // Number: 100
        System.out.println("Number: " + (x++)); // Number: 100
        System.out.println("Number: " + (++x)); // Number: 102
        System.out.println("Number: " + (x--)); // Number: 102
        System.out.println("Number: " + (--x)); // Number: 100
    }
}

public class Adding {
    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        int x = 1;
        int y = 2;

        System.out.println(a+b); // "1" + "2" = 12
        System.out.println(a+y); // "1" + 2 = 12
        System.out.println(x+b); // 1 + "2" = 12
        System.out.println(x+y); // 1 + 2 = 3

        System.out.println(8 + (3 * 2) + (21 / 3));
        System.out.println(8 + 3 * 2 + 21 / 3);

        x = 10;
        y = 20;
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " % " + y + " = " + (x % y));

        double number = 12.4567933249;
        number = Math.round(number * 1000);
        System.out.println(number);
        number = number / 1000;
        System.out.println(number);

        number = 1234.36467;
        System.out.println(Math.round(number * 100.0) / 100.0);
    }
}

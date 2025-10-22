public class Digits{
    public static void main(String[] args) {
        int number = 37402;
        System.out.println("First Digit: " + (number / 10000));
        number = number % 10000;
        System.out.println("Second Digit: " + (number / 1000));
        number = number % 1000;
        System.out.println("Third Digit: " + (number / 100));
        number = number % 100;
        System.out.println("Fourth Digit: " + (number / 10));
        number = number % 10;
        System.out.println("Third Digit: " + (number));
    }
}
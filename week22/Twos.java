public class Twos {
    public static void main(String[] args) {
        int total = 0;
        System.out.println();
        for(int i = 20; i >= 12; i -= 2){
            System.out.print(i + " + ");
            total += i;
        }
        total += 10;
        System.out.println(" 10 = " + total);
        System.out.println();
    }
}

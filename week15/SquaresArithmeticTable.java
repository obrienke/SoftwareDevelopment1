public class SquaresArithmeticTable {
    public static void main(String[] args) {
        int total = 0;
        String div = "----------------\n";
        div += "Number \t Square\n";
        div += "----------------\n";

        int i = 1;
        while(i <= 10){
            div += i + " \t " + (i * i) + "\n";
            total = total + (i * i);
            i++;
        }
        div += "----------------\n";
        div += "Total \t " + total + "\n";
        div += "----------------\n";
        System.out.println(div);
    }
}

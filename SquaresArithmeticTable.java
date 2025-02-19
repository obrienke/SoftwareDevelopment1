public class SquaresArithmeticTable{
    public static void main(String[] args){
        String output = "---------------\nNumber\tSquare\n---------------\n";
        int total = 0;
        int count = 1;
        while(count <= 10){
            output += count + "\t" + (count * count) + "\n";
            total += (count * count);
            count++;
        }
        output += "---------------\nTotal\t" + total + "\n---------------\n";
        System.out.println(output);
    }
}
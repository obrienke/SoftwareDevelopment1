public class Exercise3 {
    public static void main(String[] args) {
        String output = "";
        for(int i = 1; i <= 20; i++){
            output += i + ", ";
        }
        output = output.substring(0, output.length() - 2);
        System.out.println(output);

        for(int i = 1; i <= 19; i++){
            System.out.print(i + ", ");
        }
        System.out.println("20");
    }
}
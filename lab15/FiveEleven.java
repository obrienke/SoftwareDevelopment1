public class FiveEleven {
    public static void main(String[] args) {
        String output5 = "", output11 = "";
        System.out.println("Divisible by 5 and 11:");
        for(int i = 1; i <= 50; i++){
            if(i % 5 == 0){
                System.out.print(i);
                output5 += i;
                if(i != 50){
                    System.out.print(", ");
                    output5 += ", ";
                }
            }
            if(i % 11 == 0){
                System.out.print(i);
                output11 += i;
                System.out.print(", ");
                if(i != 50 && (i + 11) < 50){
                    output11 += ", ";
                }
            }
        }
        System.out.println("\nDivisible by 5:");
        System.out.println(output5);
        System.out.println("Divisible by 11:");
        System.out.println(output11);
    }
}

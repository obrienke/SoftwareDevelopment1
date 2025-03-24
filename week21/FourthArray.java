package week21;
public class FourthArray {
    public static void main(String[] args) {
        int[] numbers = {7, 6, 11, 15, 19};
        int total = 0;
        int index = 0;
        while(index < numbers.length - 1){
            System.out.print(numbers[index] + " + ");
            total += numbers[index];
            index++;
        }
        total += numbers[index];
        System.out.println(numbers[index] + " = "  + total);
        System.out.println("Total: " + total);        
    }
}

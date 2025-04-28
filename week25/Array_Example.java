import java.util.Scanner;
public class Array_Example{
    public static void main(String[] args) {
        int[] ages = new int[3]; //{0, 0, 0}
        String[] names = {"Sawyer", "Kendall", "Truman"};
        double total = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < ages.length; i++){
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = input.nextInt();
        }

        System.out.println("\nName\t\tAge");
        System.out.println("----\t\t---");
        for(int i = 0; i < ages.length; i++){
            System.out.println(names[i] + "\t\t" + ages[i]);
            total += ages[i];
        }
        average = Math.round((total / ages.length * 100.0)) / 100.0;
        System.out.println("\nAverage Age: " + average);
        input.close();
    }
}
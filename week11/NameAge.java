import java.util.Scanner;
public class NameAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.println();
        System.out.print("Enter your first name: ");
        name = input.next();
        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println();
        System.out.println(name + " you are " + age + " years old. In 20 years " +
                            "time you will be " + (age + 20) + " years old.");

        System.out.println();
        input.close();
    }
}

public class Increment{
    public static void main(String[] args) {
        //exercise 4
        int number = 10;

        System.out.println("\nNumber before post increment: " + number);
        System.out.println("Post increment number: " + (number++));
        System.out.println("Number after post increment: " + number);

        number = 10;
        System.out.println("\nNumber before pre increment: " + number);
        System.out.println("Pre increment number: " + (++number));
        System.out.println("Number after pre increment: " + number + "\n");

        //exercise 5
         number = 10;
        System.out.println("\nNumber before post decrement: " + number);
        System.out.println("Post decrement number: " + (number--));
        System.out.println("Number after post decrement: " + number);

        number = 10;
        System.out.println("\nNumber before pre decrement: " + number);
        System.out.println("Pre decrement number: " + (--number));
        System.out.println("Number after pre decrement: " + number + "\n");

    }
}
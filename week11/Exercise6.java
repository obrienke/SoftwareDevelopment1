import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double time = 0;
        double distance = 0;
        char metric = 'k';
        double pace = 0;
        System.out.print("Enter target time in minutes: ");
        time = input.nextDouble();
        System.out.print("Enter preferred metric (k or m): ");
        metric = input.next().charAt(0);
        if(metric == 'k'){
            System.out.print("Enter distance in kilometres: ");
        }else{
            System.out.print("Enter distance in miles: ");
        }
        distance = input.nextDouble();

        pace = time / distance;

        if(metric == 'k'){
            System.out.println("To run " + distance + " kms in " + time + " minutes. Run at a pace of " + pace + " kms per minute");
        }else{
            System.out.println("To run " + distance + " miles in " + time + " minutes. Run at a pace of " + pace + " miles per minute");
        }

        if(metric == 'k'){
            time = pace * 42;
        }else{
            time = pace * 26.2;
        }
        System.out.println("At that pace you will run a marathon in " + time + " minutes.");
        input.close();
    }
}

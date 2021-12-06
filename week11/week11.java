import java.util.Scanner;
public class week11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        double y = 0;
        String name = "";

        System.out.print("Enter a number: ");
        x = input.nextInt();
        System.out.print("Enter another number: ");
        y = input.nextDouble();
        System.out.print("Enter name: ");
        name = input.next();

        System.out.println(name + " you entered the numbers " + x + " and " + y);

        if(x != 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(name.equals("Kevin")){
            System.out.println("true");
        }

        switch(x){
            case 1:
                System.out.println("it is 1");
                break;
            case 2:
                System.out.println("it is 2");
                break;
            default:
                System.out.println("not 1 or 2");
        }

        input.close();
    }
}

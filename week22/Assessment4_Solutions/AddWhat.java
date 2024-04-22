import java.util.Scanner;
public class AddWhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0, y = 0;
        String name = "";

        System.out.print("\nEnter a number: ");
        x = input.nextInt();
        
        System.out.print("\n" + x + " updated to: ");
        if(x >= 50 && x <= 75){
            x += 50;
        }else if(x >= 100 && x <= 125){
            x += 100;
        }else if(x >= 150 && x <= 175){
            x += 150;
        }else if(x >= 200 && x <= 225){
            x += 200;
        }else{
            x += 10;
        }
        System.out.println(x + "\n");
        input.close();
    }
}

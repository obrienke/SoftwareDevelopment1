import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String colour = "";
        System.out.print("Enter colour: ");
        colour = input.next();
        
        if(colour.toLowerCase().equals("red")){
            System.out.println("Red: Stop");
        }else if(colour.toLowerCase().equals("yellow")){
            System.out.println("Yellow: Ready");
        }else if(colour.toLowerCase().equals("green")){
            System.out.println("Green: Go");
        }else{
            System.out.println("Invalid traffic light colour.");
        }
        input.close();
    }
}

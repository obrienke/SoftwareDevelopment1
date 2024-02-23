import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;  
        int qty = 0;
        String div = "------------------------------\n";
        String output = "";

        output += div;
        output += "Item \t\tSold \tTotal\n";
        output += div;

        for(int i = 1; i <= 4; i++){
            System.out.print("Enter number of item " + i + " sold: ");
            qty = input.nextInt();
            output += "Product " + i + "\t" + qty + "\t";
            if(i == 1){
                total = total + (qty * 239.99);
                output += Math.round(qty * 239.99) + "\n";
            }else if(i == 2){
                total = total + (qty * 129.75);
                output += Math.round(qty * 129.75) + "\n";
            }else if(i == 3){
                total = total + (qty * 99.96);
                output += Math.round(qty * 99.96) + "\n";
            }else{
                total = total + (qty * 350.89); 
                output += Math.round(qty * 350.89) + "\n";
            }
        }
        output += div;
        output += "Total:\t\t\t"+Math.round(total) + "\n";
        output += div;
        output += "Commission:\t\t"+Math.round(total * 0.09) + "\n";
        output += div;
        System.out.println("\n" + output);
        //total = total * 0.09;
        //System.out.println("Earnings for week: " + Math.round(total + 200));
        input.close();
    }
}
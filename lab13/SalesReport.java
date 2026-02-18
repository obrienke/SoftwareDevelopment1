import java.util.Scanner;
public class SalesReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gross = 0;
        int qty = 0; 
        double total = 0;
        String output = "";
        output += "-----------------------------\n";
        output += "Item\t\tSold\tTotal\n";
        output += "-----------------------------\n";

        for(int i = 1; i <= 4; i++){
            System.out.print("Quantity sold of product " + i + ": ");
            qty = input.nextInt();
            total = 0;
            if(i == 1){
                total = qty * 239.99;
                gross += total;
            }else if(i == 2){
                total = qty * 129.75;
                gross += total;    
            }else if(i == 3){
                total = qty * 99.96;
                gross += total;    
            }else{
                total = qty * 350.89;
                gross += total;
            }
            output += "Product " + i + "\t" + qty + "\t" + Math.round(total) + "\n";
        }
        output += "-----------------------------\n";
        output += "Total: \t\t\t" + Math.round(gross) + "\n";
        output += "-----------------------------\n";
        output += "Earnings: \t\t" + Math.round(gross * 0.09 + 200) + "\n";
        output += "-----------------------------\n";
        System.out.println();
        System.out.println(output);
        //System.out.println("Total earnings: " + Math.round(gross * 0.09 + 200));
        input.close();
    }
}

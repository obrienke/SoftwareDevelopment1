import java.util.Scanner;
public class SalesReport{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberSold = 0;
        double sales = 0;
        String div = "-----------------------------\n";
        String output = div;
        output += "Item\t\tSold\tTotal\n";
        output += div;
        

        for(int product = 1; product <= 4; product++){
            System.out.print("Number of items sold, product " + product + ": ");
            numberSold = input.nextInt();
            output += "Product " + product + "\t" + numberSold + "\t";
            if(product == 1){
                output += Math.round(239.99 * numberSold) + "\n";
                sales += 239.99 * numberSold;
            }else if(product == 2){
                output += Math.round(129.75 * numberSold) + "\n";
                sales += 129.75 * numberSold;
            }else if(product == 3){
                output += Math.round(99.96 * numberSold) + "\n";
                sales += 99.96 * numberSold;
            }else{
                output += Math.round(350.89 * numberSold) + "\n";
                sales += 350.89 * numberSold;
            }
        }
        output += div;
        output += "Total:\t\t\t" + Math.round(sales) + "\n";
        output += div;
        output += "Commission:\t\t" + Math.round(sales * 0.09) + "\n";
        output += div;
        System.out.println(output);
        input.close();
    }
}
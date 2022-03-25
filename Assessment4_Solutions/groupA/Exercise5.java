public class Exercise5 {
    public static void main(String[] args) {
        //while loop
        int outer = 1;
        int number = 1;
        while(outer <= 5){
            System.out.print("Line "+outer+": ");
            int inner = 1;
            while(inner <=3){
                System.out.print(number+", ");
                inner++;
                number++;
            }
            System.out.print(number);
            number++;
            System.out.println();
            outer++;
        }  
    }
}

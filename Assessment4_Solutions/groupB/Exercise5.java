public class Exercise5 {
    public static void main(String[] args) {
        int outer = 1;
        while(outer <= 4){
            int tabs = 3;
            while(outer <= tabs){
                System.out.print("\t");
                tabs--;
            }
            int numbers = 5 - outer;
            while(numbers <= 4){
                System.out.print(numbers+"\t");
                numbers++;
            }
            System.out.println();
            outer++;
        }  
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        for(int outer = 1; outer <= 4; outer++){ // loops 4 times
            for(int tabs = 3; tabs >= outer; tabs--){
                System.out.print("\t");
            }
            for(int number = 5 - outer; number <= 4; number++){
                System.out.print(number + "\t");
            }	
            System.out.println();
        }       
    }
}

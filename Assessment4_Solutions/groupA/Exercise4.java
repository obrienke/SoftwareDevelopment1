public class Exercise4 {
    public static void main(String[] args) {
        //while loop
        int number = 0;
        while(number < 4){
            System.out.println("Assessment " + (number + 1));
            number++;
        }
        System.out.println();
        //for loop
        for(int counter = 1; counter <= 4; counter++){
            System.out.println("Assessment " + counter);
        }    
    }
}

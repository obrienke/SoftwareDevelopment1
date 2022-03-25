public class Exercise4 {
    public static void main(String[] args) {
        //while loop
        int number = 0;
        while(number < 20){
            System.out.println("Week " + (number + 1));
            number++;
        }
        System.out.println();
        //for loop
        for(int counter = 1; counter <= 20; counter++){
            System.out.println("Week " + counter);
        }    
    }
}

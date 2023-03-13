public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("While Loop:\n");
        int counter = 1;
        while(counter <= 20){
            System.out.println("Week " + counter);
            counter++;
        }

        System.out.println("\nFor Loop:\n");
        for(int i = 1; i <= 20; i++){
            System.out.println("Week " + i);
        }
    }
}

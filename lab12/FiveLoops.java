public class FiveLoops {
    public static void main(String[] args) {
        int counter = 1;
        while(counter <= 5){
            System.out.println(counter + ". Iteration.");
            counter++;
        }
        System.out.println();
        while(counter >= 0){
            System.out.println(counter + ". Iteration.");
            counter--;
        } 
        System.out.println();
        int x = 1;
        int y = 5;
        while(x <= 5 && y >= 1){
            System.out.println(x + ". Up");
            System.out.println(y + ". Down");
            x++;
            y--;
        }
    }
}

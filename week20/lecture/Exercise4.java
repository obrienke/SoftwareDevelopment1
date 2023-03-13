public class Exercise4{
    public static void main(String[] args) {
        System.out.println("For Loop:");
        for(int i = 1; i <= 4; i++){
            System.out.println("Assessment " + i);
        }
        System.out.println("\nWhile Loop:");
        int count = 1;
        while(count <= 4){
            System.out.println("Assessment " + count);
            count++;
        }
    }
}
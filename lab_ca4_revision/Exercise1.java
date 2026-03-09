public class Exercise1 {
    public static void main(String[] args) {
        int times = 6;
        System.out.println("While Loop");
        System.out.println("----- ----");
        int i = 1;
        while (i <= times) {
            System.out.println("Assessment " + i);
            i++;
        }
        System.out.println();
        System.out.println("For Loop");
        System.out.println("--- ----");
        for(i = 1; i <= times; i++){
            System.out.println("Assessment " + i);
        }
        System.out.println();
        System.out.println("do while");
        System.out.println("-- -----"); 
        i = 1;
        do{
           System.out.println("Assessment " + i); 
           i++;
        }while(i <= times);
    }
}
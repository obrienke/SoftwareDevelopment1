public class Odd {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i <= 15; i++){
            if(i % 2 == 1){
                total += i;
            }
        }
        System.out.println(total);
        total = 0;
        for(int i = 1; i <= 15; i = i + 2){
            total += i;
        }
        System.out.println(total);
        total = 0;
        for(int i = 1; i <= 15; total += i, i = i + 2){
            ;
        }

        System.out.println(total);
    }
}

public class Reverse{
    public static void main(String[] args){
        for(int i = 20; i >= 1; i--){
            System.out.println("iteration " + i);
        }
        int sum = 0;
        for(int i = 1; i <= 15; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
        sum = 0;
        for(int i = 1; i <= 15; i += 2){
                sum += i;
        }
        System.out.println(sum);
    }
}

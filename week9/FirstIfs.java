public class FirstIfs {
    public static void main(String[] args) {
        int x = 2;
        if(x == 1){
            System.out.println(x + " is equal to 1");
        }
        if(x != 1){
            System.out.println(x + " is not equal to 1");
        }
        if(x > 1){
            System.out.println(x + " is greater than 1");
        }
        if(x < 1){
            System.out.println(x + " is less than 1");
        }
        boolean result;
        result = (x != 1);
        if(result){
            System.out.println(x + " is not equal to 1");
        }
    }
}

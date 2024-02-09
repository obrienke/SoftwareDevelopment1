public class TwentyNums {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 20){
            if(i < 20){
                System.out.print(i + " + ");
            }else{
                System.out.print(i);
            }
            i++;
        }
        System.out.println();
        //alternative way of achieving same output.
        i = 1;
        while(i <= 19){
            System.out.print(i + " + ");
            i++;
        }
        System.out.println(i);
    }
}

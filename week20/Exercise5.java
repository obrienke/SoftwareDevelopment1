public class Exercise5{
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            System.out.print(i + ": ");
            int j = 8;
            for(; j >= 4; j -= 2){
                System.out.print(j + ", ");
            }
            System.out.print(j);
            System.out.println();
        }
    }
}


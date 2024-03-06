public class Five {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            if(i%5 == 0){
                if(i != 50){
                    System.out.print(i + ", ");
                }else{
                    System.out.print(i);
                }
            }
        }
        System.out.println();
        for(int i = 5; i <= 45; i = i + 5){
            System.out.print(i + ", ");
        }
        System.out.println("50");
        
    }
}

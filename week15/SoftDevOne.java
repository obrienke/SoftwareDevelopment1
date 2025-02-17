public class SoftDevOne {
    public static void main(String[] args) {
        int i = 1;
        System.out.println();
        while(i <= 30){
            if(i != 4 && i != 15 && i != 21 && i != 29){
                System.out.print(" " + i);
            }else{
                if(i == 4){
                    System.out.print(" Soft");        
                }else if(i == 15){
                    System.out.print(" Dev");        
                }else if(i == 21){
                    System.out.print(" One");        
                }else{
                    System.out.print(" SoftDevOne");
                }
            }
            i++;
        }
        System.out.println();
        System.out.println();
    }
}

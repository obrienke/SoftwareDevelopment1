public class FiveEleven {
    public static void main(String[] args) {
        String five = "";
        String eleven = "";
        String both = "";

        for(int i = 1; i <= 50; i++){
            if(i%11 == 0){
                if(i != 44){
                    eleven += i + ", ";
                }else{
                    eleven += i;
                }
            }
            if(i%5 == 0){
                if(i != 50){
                    five += i + ", ";
                }else{
                    five += i;
                }
            }
            if(i%5 == 0 || i%11 == 0){
                if(i != 50){
                    both += i + ", ";
                }else{
                    both += i;
                }
            }
        }
        System.out.println(five);
        System.out.println(eleven);
        System.out.println(both);
        
    }
}

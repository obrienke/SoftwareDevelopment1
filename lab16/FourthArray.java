public class FourthArray{
    public static void main(String[] args) {
        int[] x = {7, 6, 11, 15, 19, 9};
        int total = 0;
        for(int i = 0; i < x.length; i++){
            total += x[i];
        } 
        System.out.println("Total: " + total);
    }    
}
public class loops{
    public static void main(String[] args) {
        int i = 1;
        while(i <= 3){
            System.out.println(i + ". while loop.");
            i++;
        }
        
        System.out.println();

        for(int count = 1; count <= 3; count++){
            System.out.println(count + ". for loop.");
        }
    }
}
public class Arrays {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println("In reverse:");
        for(int i = x.length - 1; i >= 0; i--){
            System.out.print(x[i] + " ");
        }
        int y = 4;
        if(y == 4 && y < 7 && y > 1){
            System.out.println("true");
        }
        System.out.println();
        int total = 0;
        for(int i = 0; i < x.length; i++){
            if(i == 0 || i == 4 || i == 8 || i == 12){
                total += x[i];
                System.out.print(x[i] + " ");
            } 
        }
        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + (total/4));
    }
}

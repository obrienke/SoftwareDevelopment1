public class Arrays{
    public static void main(String[] args){

        // Array example
        int [] x = {100, 200, 300};

        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x.length);

        //output contents of array using a loop
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

        // Multi dimensional array example
        int [][] y = {{20, 30}, {40, 50, 60}}; 

        //output contents of multi dimensional array using a nested loop
        for(int i = 0; i < y.length; i++){
            for(int j = 0; j < y[i].length; j++){
                System.out.println(y[i][j]);
            }
        }
    }
}
public class PrintArray {
    public static void main(String[] args) {
        int[] x = {10,2,3,4,50,6,7,8,9,100};
        
        outputArray(x);
        
    }
    
    static void outputArray(int[] array){
        System.out.println("Index\tValue\tSquare");
        System.out.println("+++++\t+++++\t++++++");
        for(int i = 0; i < array.length; i++){
            System.out.println(i + "\t" + array[i] + "\t" + squareOf(array[i])); 
        }        
    }
    static int squareOf(int val){
        return val * val;
    }
}

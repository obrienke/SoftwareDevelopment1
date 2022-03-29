public class SeventhArray{
	public static void main(String[] args){
        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
        int[] y = new int[x.length];

        for(int i = x.length - 1, j = 0; i >= 0; i--, j++){
            y[j] = x[i];
        }

        System.out.println("Index\tBefore\tAfter");
        System.out.println("-----\t------\t-----\n");

        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i] + "\t" + y[i]);
        }
    }
}

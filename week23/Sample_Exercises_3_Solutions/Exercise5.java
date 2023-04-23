public class Exercise5{
    public static void main(String[] args) {
        int [] x = {1, 2, 3, 4, 5, 6};
        Exercise5 ab = new Exercise5();

        // print out original array contents
        ab.printArray(x);

        // modify contents of array
        for(int i = 1; i < x.length; i += 2){
            x[i] += 100;
        }
        System.out.println();
		// print out updated array contents
        ab.printArray(x);           
    }

	//note that printing contents of array happens more than once
	//same code is used, so it can be organised into a method.
    public void printArray(int[] x){
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        int total = 0;
        for(int i = 0; i < x.length; i++){
            System.out.println(i+"\t"+x[i]);
            total += x[i];
        }
        System.out.println("------------");
        System.out.println("Total: " + total);   
    }
}
public class Exercise5{
    public static void main(String[] args) {
        int [] x = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Exercise5 aa = new Exercise5();

        // print original array
        //aa.printArray(x);

        // modify array content
        for(int i = 0; i < x.length; i++){
            x[i] *= 10;
        }
		//print updated array
        aa.printArray(x);   
    }

	//note that printing contents of array happens more than once
	//same code is used, so it can be organised into a method.
    public void printArray(int[] x){
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i = 0; i < x.length; i++){
            System.out.println(i+"\t"+x[i]);
        }   
    }
}
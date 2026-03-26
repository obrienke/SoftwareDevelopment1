public class NinthArray {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4};
        int[] second = {1, 2, 3, 4};
        int[] third = {1, 2, 67, 4};
        boolean equal = true;
        for(int i = 0; i < first.length; i++){
            if(first[i] != second[i] || first[i] != third[i]){
                equal = false;
            }
        }
        if(equal){
            System.out.println("All values equal");
        }else{
            System.out.println("All values not equal");
        }
    }
}

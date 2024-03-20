public class Lecture{
    public static void main(String[] args) {
        int [] array1 = {100, 200, 300};
        System.out.println("First value: " + array1[0]);
        System.out.println("Second value: " + array1[1]);
        System.out.println("Third value: " + array1[2]);
        System.out.println("Number of values in array: " + array1.length);
        array1[1] = 1111;
        System.out.println("Second value updated to: " + array1[1]);
        System.out.print("Using loop: ");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        String [] names = {"John", "Mary"};
        System.out.print("Names: ");
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }

        System.out.println();

        String [][] fullnames = {{"Mary", "Smith"},{"John", "Joe", "Jones"}};
        System.out.println("Fullnames: ");
        for(int i = 0; i <fullnames.length; i++){
            for(int j = 0; j < fullnames[i].length; j++){
                System.out.print(fullnames[i][j] + " ");
            }
            System.out.println();
        }

    }
}
public class Exercise5{
    public static void main(String[] args) {
        int [] x = {10, 25, 39, 41};
        
        // print out x array contents
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        int total = 0;
        for(int i = 0; i < x.length; i++){
            System.out.println(i+"\t"+x[i]);
            total += x[i];
        }
        System.out.println("------------");
        System.out.println("Total: " + total);

        String[] words = {"software", "development"};
        System.out.println();
		// print out contents of words array
        printStringArray(words);

        System.out.println();
		for(int i = 0; i < words.length; i++){
            words[i] = convertFirstCharToUpperCase(words[i]);
        }

        // print out contents of words array
        printStringArray(words);          
    }

    static String convertFirstCharToUpperCase(String word){
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    static void printStringArray(String[] words){
        System.out.println("Index\tValue");
        System.out.println("-----\t-----");
        for(int i = 0; i < words.length; i++){
            System.out.println(i+"\t"+words[i]);
        }
    }

}
public class Exercise4{
    public static void main(String[] args){
        
        //System.out.println(text);
        String output = "";
        int total = 0;
        for(int i = 20; i >= 10; i = i - 2){
            output = output + i + " + ";
            total += i;
        }
        
        System.out.println(output.substring(0, output.length() - 3) + " = " + total);

        output = "";
        total = 0;
        int i = 20;
        for(; i >= 12; i = i - 2){
            output = output + i + " + ";
            total += i;
        }
        output += i;
        total += i;
        System.out.println(output + " = " + total);
    }
}


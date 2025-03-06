public class Five{
    public static void main(String[] args){
        String output = "";
        System.out.println("Divisible by 5:");
        for(int i = 1; i <= 50; i++){
            if(i%5 == 0)
                output += i + ", ";
        }
        output = output.substring(0,output.length() - 2);
        System.out.println(output);   
        
        int count = 5;
        while(count <= 49){
            System.out.print(count + ", ");
            count += 5;
        }
        System.out.print(count);
        System.out.println();
    }
} 
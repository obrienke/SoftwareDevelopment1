public class FiveEleven{
    public static void main(String[] args){
        String output1 = "", output2 = "", output3 = "";
        for(int i = 1; i <= 50; i++){
            if(i%5 == 0)
                output1 += i + ", ";
            if(i%11 == 0)
                output2 += i + ", ";
            if(i%5 == 0 || i%11 == 0)
                output3 += i + ", "; 
        }
        output1 = output1.substring(0,output1.length() - 2);
        System.out.println("Divisible by 5:\n" + output1);
        output2 = output2.substring(0,output2.length() - 2);
        System.out.println("Divisible by 11:\n" + output2)  ;
        output3 = output3.substring(0,output3.length() - 2);
        System.out.println("Divisible by 5 and 11:\n" + output3);           
    }
} 
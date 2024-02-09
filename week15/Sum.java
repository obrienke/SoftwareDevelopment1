public class Sum {
    public static void main(String[] args) {
        int total = 0;
        int even = 0;
        int odd = 0;

        int i = 1;
        while(i <= 100){
            total += i;
            if(i%2 == 0){
                even += i;
            }else{
                odd += i;
            }
            i++;
        }
        System.out.println("Sum of all numbers from 1 to 100: " + total);
        System.out.println("Sum of even numbers from 1 to 100: " + even);
        System.out.println("Sum of odd numbers from 1 to 100: " + odd);
        if((odd - even) >= 0){
            System.out.println("Diff between odd and even: " + (odd - even));
        }else{
            System.out.println("Diff between odd and even: " + (even - odd));
        }
        
    }
}

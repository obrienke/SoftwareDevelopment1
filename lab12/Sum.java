public class Sum {
    public static void main(String[] args) {
        int total = 0, odd = 0, even = 0, i = 1;
        while(i <= 100){
            total = total + i;
            if(i%2 == 0){
                even = even + i;
            }else{
                odd += i;
            }
            i++;
        }
        System.out.println("Sum of numbers: " + total);
        System.out.println("Even total: " + even);
        System.out.println("Odd total: " + odd);
        if(odd > even){
            odd = odd - even;
        }else{
            odd = even - odd;
        }
        System.out.println("Diff: " + odd);
    }
}

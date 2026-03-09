public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Part A:");
        for(int row = 1; row <= 6; row++){
            for(int column = 1; column <= row; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("Part B:");
        int counter = 10;
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(counter++ + " ");
            }
            counter = 10;
            System.out.println();
        }
        System.out.println("Part C:");
        counter = 10;
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((counter + (j - 1)) + " ");
            }
            System.out.println();
        }
        int flag = 0;
        do{
            System.out.print("Enter - 1 to quit: ");
            flag = input.nextInt();
        }while(flag != -1);
        input.close();
    }
}

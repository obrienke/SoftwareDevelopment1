public class Jane {
    public static void main(String[] args) {
        //Jane is 20 years old and is studying English in TUS. Some day she hopes to be a journalist.
        String name = "Jane", subject = "English", college = "TUS", job = "journalist";
        int age = 20;
        
        System.out.println(name + " is " + age + " years old and is studying " + subject + " in " + college+ ".");
        System.out.println("Some day she hopes to be a " + job + ".");

        String output = name + " is " + age + " years old and is studying " + subject + " in " + college+ ".";
        output = output + "\nSome day she hopes to be a " + job + ".";

        System.out.println(output);
    }
}

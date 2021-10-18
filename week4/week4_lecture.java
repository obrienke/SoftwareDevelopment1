public class week4_lecture {
    public static void main(String[] args){

        /*In editor, how to use multiple lines on output for a long string of text - e.g. a paragraph, 
        so it doesn't go off the right edge of editor window. Note it will still work if it does go
        off the right edge, but it is just eaier to read and maintain if split over multiple lines
        in the editor. */
        System.out.println("The original novel told the story of the friendship between a large male bear" + 
                            "named Ben and a boy named Mark. The story provided the basis for the 1967 film" +
                            " Gentle Giant (1967), the popular late 1960s U.S. television series Gentle Ben," + 
                            " a 1970s animated cartoon and two early 2000s made-for-TV movies.");

        //String concatenation examples:
        System.out.println("Kevin O'Brien");
        System.out.println("Kevin" + " O'Brien");
        System.out.println("Mr. " + "Kevin" + " O'Brien");
        System.out.println("Mr. " + "Kevin" + " O'Brien" + " I");

        //Variables
        String firstname = "Kevin";
        firstname = "John";
        String lastname = "Smith";

        System.out.println("Name: " + firstname + " " + lastname);
    }
}
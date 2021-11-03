import javax.swing.JOptionPane;

public class Test{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");
        System.out.println("Your name is: "+name);
    }
}
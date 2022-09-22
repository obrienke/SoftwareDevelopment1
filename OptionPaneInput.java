//Example program which uses JOptionPane to accept user inputs.
import javax.swing.JOptionPane;

public class OptionPaneInput{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");
        System.out.println("Your name is: "+name);
    }
}

package bradley;

/*
 * @ author Bradley
 */
import javax.swing.JOptionPane;

public class Adding2 {

    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        int a, b, sum;
        s = JOptionPane.showInputDialog("Enter 1st number");
        a = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Enter 2nd number");
        b = Integer.parseInt(s);
        sum = a + b;
        JOptionPane.showMessageDialog(null, a + " + " + b + " = " + sum);
    }

}

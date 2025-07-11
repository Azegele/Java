package bradley;

import javax.swing.JOptionPane;

/*
 * @ author Bradley
 */
public class Testif {
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        double a, b, c, large;
        s = JOptionPane.showInputDialog("Enter first value");
        a = Double.parseDouble(s);

        s = JOptionPane.showInputDialog("Enter second value");
        b = Double.parseDouble(s);

        s = JOptionPane.showInputDialog("Enter third value");
        c = Double.parseDouble(s);

        large = a;
        if (b > large) {
            large = b;
        }
        if (c > large) {
            large = c;
        }

        JOptionPane.showMessageDialog(null, "The largest is " + large);
    }

}

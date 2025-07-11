package bradley;

import javax.swing.JOptionPane;

/*
 * @ author Bradley
 */
public class Testif2 {
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

        if (a > b) {
            large = a;
        } else {
            large = b;
        }

        if (c > large) {
            large = c;
        }

        JOptionPane.showMessageDialog(null, "The largest is " + large);
    }

}

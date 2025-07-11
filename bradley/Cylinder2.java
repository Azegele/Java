package bradley;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
 * @ author Bradley
 */
public class Cylinder2 {

    public static void main(String[] args) {
        // TODO code application logic here
        double r, h, v;
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter radius "));
        h = Double.parseDouble(JOptionPane.showInputDialog("Enter height "));
        v = Math.PI * Math.pow(r, 2) * h;
        DecimalFormat df = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "The volume is" + df.format(v));
    }

}

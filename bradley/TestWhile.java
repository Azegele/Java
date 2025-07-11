package bradley;

import javax.swing.JOptionPane;

import javafx.scene.control.TextArea;

/*
 * @ author  Bradley
 */
public class TestWhile {
    // TODO code application logic here
    public static void main(String[] args) {
        int n = 1;
        TextArea output = new TextArea(10, 5);
        while (n <= 100) {
            output.append(n + "\n");
            n++;
        }
        JOptionPane.showMessageDialog(null, output);

    }
}

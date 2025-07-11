package bradley;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.GridLayout;

public class AddingGUI extends JFrame implements ActionListener {
    JLabel first, second, sum;
    JTextField txtfirst, txtsecond, txtsum;
    JButton submit, exit;

    public AddingGUI() {
        setSize(200, 200);
        setLayout(new GridLayout(4, 2));
        setLocation(450, 500);

        first = new JLabel("First Number");
        second = new JLabel("Second Number");
        sum = new JLabel("Sum");

        txtfirst = new JTextField(20);
        txtsecond = new JTextField(20);
        txtsum = new JTextField(20);

        submit = new JButton("Submit");
        exit = new JButton("Exit");

        // arrange the structure of the table (put objects in the panel)
        add(first);
        add(txtfirst);
        txtfirst.setBackground(Color.cyan);

        add(second);
        add(txtsecond);

        add(sum);
        add(txtsum);
        txtsum.setFocusable(false);

        add(submit);
        add(exit);

        submit.addActionListener(this);
        exit.addActionListener(this);
        setVisible(true);

    }

    public static void main(String[] args) {
        // TODO code application here
        AddingGUI form = new AddingGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            double a, b, sum;
            a = Double.parseDouble(txtfirst.getText());
            b = Double.parseDouble(txtsecond.getText());

            sum = a + b;
            txtsum.setText(sum + "");
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

}

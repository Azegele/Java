package bradley;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.GridLayout;

public class SphereVolumeGUI extends JFrame implements ActionListener {
    JLabel first, volume;
    JTextField txtfirst, txtvolume;
    JButton submit, exit;

    public SphereVolumeGUI() {
        setSize(200, 200);
        setLayout(new GridLayout(4, 2));
        setLocation(450, 500);

        first = new JLabel("Radius");
        volume = new JLabel("Volume");

        txtfirst = new JTextField(20);
        txtvolume = new JTextField(20);

        submit = new JButton("Submit");
        exit = new JButton("Exit");

        // arrange the structure of the table (put objects in the panel)
        add(first);
        add(txtfirst);
        txtfirst.setBackground(Color.cyan);

        add(volume);
        add(txtvolume);
        txtvolume.setFocusable(false);

        add(submit);
        add(exit);

        submit.addActionListener(this);
        exit.addActionListener(this);
        setVisible(true);

    }

    public static void main(String[] args) {
        SphereVolumeGUI form = new SphereVolumeGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            double a, vol;
            a = Double.parseDouble(txtfirst.getText());

            vol = (4.0 / 3.0) * Math.PI * a * a * a;
            txtvolume.setText(vol + "");
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

}
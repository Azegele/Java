package bradley;

import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.scene.control.TextArea;

public class TestStudent {

    public static void main(String[] args) {
        // TODO code application logic here
        TextArea output = new TextArea(10, 40);
        output.append("First Name\tLast Name\tAge\tGender\tID Number\tFees\n");
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student usiu = new Student(); // make work
            usiu.firstname = obj.next();
            usiu.lastname = obj.next();
            usiu.age = obj.nextInt();
            usiu.gender = obj.next();
            usiu.idnumber = obj.next();
            usiu.fees = obj.nextDouble();
            output.append(usiu.toString());
        }
        JOptionPane.showMessageDialog(null, output);
    }

}

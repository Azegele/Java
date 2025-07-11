package bradley;

import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.scene.control.TextArea;

public class TestStudent {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        FileWriter output = new FileWriter("students.txt", true);
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter firstname lastname age gender idnumber fees");
        for (int i = 0; i < 2; i++) {
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

package bradley;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cylinder {

    public static void main(String[] args) {
        double r, h, v;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter radius and height");
        r = obj.nextDouble();
        h = obj.nextDouble();
        v = 3.14 * r * r * h;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println("The volume is " + df.format(v));
    }
}

package Question2;

/*
 * Authors:
 *    Adan Zahra Dagane         669547 
 *    Azegele Bradley Kikaya    668341 
 *    Basil Simon Basil         672261 
 *    Dobdinga Mantan Dela      669212 
 *    Gathoni Tyra Nyonyo       670114  
 */

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double volume = (4.0 / 3.0) * (22.0 / 7.0) * (radius * radius * radius);
        System.out.println("The volume of the sphere is: " + volume);
    }
}

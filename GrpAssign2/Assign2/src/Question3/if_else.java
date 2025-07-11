package Question3;

/*
 * Authors:
 *    Adan Zahra Dagane         669547 
 *    Azegele Bradley Kikaya    668341 
 *    Basil Simon Basil         672261 
 *    Dobdinga Mantan Dela      669212 
 *    Gathoni Tyra Nyonyo       670114  
 */

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter yes (y) or no (n): ");
        String input = scanner.nextLine();

        if (input.equals("y")) {
            System.out.println("You entered yes.");
        } else {
            System.out.println("You entered no.");
        }
    }
}

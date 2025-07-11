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

public class while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("Heisenberg")) {
            System.out.print("Say my name?!: ");
            input = scanner.nextLine();
        }

        System.out.println("You're Goddamn RIGHT!!");
    }
}

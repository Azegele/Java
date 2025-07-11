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

public class for_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many items do you want to enter for your shopping list? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        String[] items = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            items[i] = scanner.nextLine();
        }

        System.out.println("Your shopping list:");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}

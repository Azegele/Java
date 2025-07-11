package Question4;

/*
 * Authors:
 *    Adan Zahra Dagane         669547 
 *    Azegele Bradley Kikaya    668341 
 *    Basil Simon Basil         672261 
 *    Dobdinga Mantan Dela      669212 
 *    Gathoni Tyra Nyonyo       670114  
 */

import java.util.Scanner;

public class NetIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gross pay: ");
        double grossPay = scanner.nextDouble();
        System.out.print("Enter tax rate (as a decimal, e.g., 0.2 for 20%): ");
        double taxRate = scanner.nextDouble();

        double netIncome = grossPay - (grossPay * taxRate);
        System.out.printf("Net income: %.2f\n", netIncome);
    }
}

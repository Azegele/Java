/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bradley;

import java.util.ArrayList; // Corrected import: Removed unnecessary static import for println

/**
 *
 * @author AzegeleBradley
 */
public class DynamicArray {

    // The 'i' variable here is not used, so it can be removed or used if intended for a class-level purpose.
    // int i; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(343);
        list.add(343421);

        list.remove(1); // Removes the element at index 1 (which is 343)

        // Corrected print statement: System.out.print instead of System.out,print
        // Added System.out.println() for better readability after the first loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // Added a space for better separation
        }
        System.out.println(); // Prints a new line for better formatting between loops

        // This enhanced for loop (for-each loop) correctly prints elements with tabs
        for (Integer x : list) {
            System.out.print(x + "\t");
        }

    }

}
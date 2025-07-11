/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bradley;

import java.util.ArrayList; // Added import for ArrayList
import java.util.Scanner;

/**
 *
 * @author AzegeleBradley
 */
public class TestDynamicArray {

    // Declare the list as a member variable of the class
    // This allows it to be accessible by different methods within the class
    ArrayList<Double> list; 

    // Constructor to initialize the ArrayList
    public TestDynamicArray() {
        list = new ArrayList<>();
    }

    /**
     * @param args the command line arguments
     */
    public void getsalaries() {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.print("How many salaries? "); // Added a space for better prompt
        n = obj.nextInt();
        System.out.println("Enter the values:"); // Added a colon for better prompt

        for (int i = 0; i < n; i++) {
            list.add(obj.nextDouble());
        }

        // Close the scanner to prevent resource leaks
        obj.close(); 
        
        increment(list);
        System.out.println("\nSalaries after increment:"); // Added a header for clarity
        for (double x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        TestDynamicArray usiu = new TestDynamicArray();
        usiu.getsalaries();
    }

    private void increment(ArrayList<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 1.15);
        }
    } // Added missing closing brace for the increment method
}
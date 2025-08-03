/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author AzegeleBradley
 */
public class Laptop extends Computer {
    private double weight;

    public Laptop(String manufacturer, String processor, double weight) {
        super(manufacturer, processor); // Calls Computer's constructor
        this.weight = weight;
    }

    public void showWeight() {
        System.out.println("Weight: " + weight + " kg");
    }
}

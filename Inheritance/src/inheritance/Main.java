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
public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("TechCo", "Intel i7", 1.5);

        myLaptop.showManufacturer(); // From Device
        myLaptop.showProcessor();    // From Computer
        myLaptop.showWeight();       // From Laptop

    }
}

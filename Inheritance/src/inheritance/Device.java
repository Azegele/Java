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
public class Device {
    private String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void showManufacturer() {
        System.out.println("Manufacturer: " + manufacturer);
    }
}

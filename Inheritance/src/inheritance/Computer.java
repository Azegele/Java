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
public class Computer extends Device {
    private String processor;

    public Computer(String manufacturer, String processor) {
        super(manufacturer); // Calls Device's constructor
        this.processor = processor;
    }

    public void showProcessor() {
        System.out.println("Processor: " + processor);
    }
}

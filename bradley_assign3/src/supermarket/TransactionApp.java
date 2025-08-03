/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author AzegeleBradley
 */
import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class TransactionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Supermarket Checkout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(5, 2, 5, 5));

        // Components
        JLabel nameLabel = new JLabel("Product Name:");
        JTextField nameField = new JTextField();

        JLabel priceLabel = new JLabel("Unit Price:");
        JTextField priceField = new JTextField();

        JLabel qtyLabel = new JLabel("Quantity:");
        JTextField qtyField = new JTextField();

        JLabel totalLabel = new JLabel("Total: 0.00");

        JButton calcButton = new JButton("Calculate");
        JButton saveButton = new JButton("Save Transaction");

        // Add components
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(priceLabel);
        frame.add(priceField);
        frame.add(qtyLabel);
        frame.add(qtyField);
        frame.add(calcButton);
        frame.add(saveButton);
        frame.add(new JLabel());
        frame.add(totalLabel);

        // Calculate action
        calcButton.addActionListener(e -> {
            String priceText = priceField.getText();
            String qtyText = qtyField.getText();

            double unitPrice = Double.parseDouble(priceText);
            int quantity = Integer.parseInt(qtyText);
            double total = unitPrice * quantity;

            totalLabel.setText(String.format("Total: %.2f", total));
        });

        // Save action
        saveButton.addActionListener(e -> {
            try (FileWriter writer = new FileWriter("transactions.xlsx", true)) {
                String name = nameField.getText();
                double unitPrice = Double.parseDouble(priceField.getText());
                int quantity = Integer.parseInt(qtyField.getText());
                double total = unitPrice * quantity;

                // Tab-separated values
                writer.write(name + "\t" + unitPrice + "\t" + quantity + "\t" + total + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        frame.setVisible(true);
    }
}

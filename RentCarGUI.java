package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RentCarGUI extends JFrame {
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel ageLabel;
    private JTextField ageField;
    private JLabel carLabel;
    private JComboBox carCombo;
    private JLabel daysLabel;
    private JTextField daysField;
    private JButton rentButton;
    private JLabel resultLabel;

    public RentCarGUI() {
        setTitle("Rent-A-Car Application");
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        nameLabel = new JLabel("Enter your name: ");
        nameField = new JTextField(20);
        ageLabel = new JLabel("Enter your age: ");
        ageField = new JTextField(20);
        carLabel = new JLabel("Choose a car: ");
        carCombo = new JComboBox(new String[] {"Economy", "Compact", "Standard", "Full-size"});
        daysLabel = new JLabel("Enter the number of days: ");
        daysField = new JTextField(20);
        rentButton = new JButton("Rent");
        resultLabel = new JLabel(" ");

        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(carLabel);
        add(carCombo);
        add(daysLabel);
        add(daysField);
        add(rentButton);
        add(resultLabel);

        rentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                int car = carCombo.getSelectedIndex();
                int days = Integer.parseInt(daysField.getText());
                if (age < 25) {
                    resultLabel.setText("I'm sorry, you must be at least 25 years old to rent a car.");
                } else {
                    int price = 0;
                    switch (car) {
                        case 0:
                            price = 40;
                            break;
                        case 1:
                            price = 50;
                            break;
                        case 2:
                            price = 60;
                            break;
                        case 3:
                            price = 70;
                            break;
                    }
                    int total = price * days;
                    resultLabel.setText("Total cost: $" + total);
                }
            }
        });
    }

    public static void main(String[] args) {
        RentCarGUI app = new RentCarGUI();
        app.setVisible(true);
    }
}

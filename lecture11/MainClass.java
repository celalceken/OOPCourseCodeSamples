package cc.oop.lecture11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {

    public static void main(String[] args) {
        // Creating the main frame (window)
        JFrame frame = new JFrame("Login Screen");
        frame.setSize(400, 300); // Set the frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when closed
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Creating the JPanel to hold components
        JPanel panel = new JPanel();
        frame.add(panel); // Add the panel to the frame
        placeComponents(panel); // Add components to the panel

        frame.setVisible(true); // Make the frame visible
    }

    // Method to place all components inside the panel
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null); // Manual positioning of components

        // Username label and text field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 80, 25); // Set position and size
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(150, 50, 165, 25); // Position for text field
        panel.add(userText);

        // Password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 90, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(150, 90, 165, 25);
        panel.add(passwordText);

        // "Remember Me" checkbox
        JCheckBox rememberMeCheckBox = new JCheckBox("Remember Me");
        rememberMeCheckBox.setBounds(150, 130, 150, 25);
        panel.add(rememberMeCheckBox);

        // "Forgot Password" link (simulated as a button)
        JButton forgotPasswordButton = new JButton("Forgot Password?");
        forgotPasswordButton.setBorderPainted(false);
        forgotPasswordButton.setContentAreaFilled(false); // Make it look like a link
        forgotPasswordButton.setBounds(150, 160, 150, 25);
        forgotPasswordButton.setForeground(Color.BLUE);
        panel.add(forgotPasswordButton);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 200, 80, 25);
        panel.add(loginButton);

        // Action listener for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText(); // Get the entered username
                String password = new String(passwordText.getPassword()); // Get the entered password
                boolean rememberMe = rememberMeCheckBox.isSelected(); // Check if "Remember Me" is checked

                // Check if the username and password match expected values ("2", "2")
                if (username.equals("2") && password.equals("2")) {
                    // Successfully logged in
                    JOptionPane.showMessageDialog(null, "Successfully logged in!"); // Show success message
                    showWelcomeScreen(); // Redirect to the "logged in" screen
                } else {
                    // Login failed
                    JOptionPane.showMessageDialog(null, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE); // Show error message
                }

                // Optionally, you could save the "Remember Me" preference to use in the future.
                if (rememberMe) {
                    System.out.println("Remember Me is checked. Saving preference...");
                }
            }
        });

        // Action listener for the "Forgot Password" button
        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show a dialog for password recovery (dummy action)
                JOptionPane.showMessageDialog(null, "Redirecting to password recovery...");
            }
        });
    }

    // Method to show the "Successfully logged in" page
    private static void showWelcomeScreen() {
        // Creating a new frame for the welcome screen
        JFrame welcomeFrame = new JFrame("Welcome Page");
        welcomeFrame.setSize(300, 200); // Set size of the new window
        welcomeFrame.setLocationRelativeTo(null); // Center on screen
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close application on exit

        // Creating a label to display a welcome message
        JLabel welcomeLabel = new JLabel("Welcome! You've successfully logged in.", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 16)); // Set font for the label

        // Add the welcome label to the frame
        welcomeFrame.add(welcomeLabel);

        // Show the welcome frame
        welcomeFrame.setVisible(true);
    }
}


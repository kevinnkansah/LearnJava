import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Sprint2GUI extends JFrame {
    private JPanel MainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnSubmit;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JLabel jlFirstName;
    private JLabel jlSurname;
    private JLabel jlEmail;
    private JLabel jlPassword;
    private JLabel jlNewPassword;

    public Sprint2GUI() {
        setTitle("Sprint 2 GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setContentPane(MainPanel);
        setLocationRelativeTo(null);
        setVisible(true);

        btnSubmit.addActionListener(e -> {

            String firstName = textField1.getText();
            String surName = textField2.getText();
            String email = textField3.getText();
            String newPassword = new String(passwordField1.getPassword());
            String password = new String(passwordField2.getPassword());

            if (!password.equals(newPassword)) {
                JOptionPane.showMessageDialog(Sprint2GUI.this, "Passwords do not match.");
                
            } else if (firstName.isEmpty() || surName.isEmpty() || email.isEmpty() || newPassword.isEmpty()) {
                JOptionPane.showMessageDialog(Sprint2GUI.this, "Please fill in all empty spaces.");
                
            } else {
                try {
                    FileWriter infoWriter = new FileWriter("info.txt");
                    infoWriter.write("First Name: " + firstName + "\n");
                    infoWriter.write("Surname: " + surName + "\n");
                    infoWriter.write("Email: " + email + "\n");

                    infoWriter.close();

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Sprint2GUI::new);
    }
}

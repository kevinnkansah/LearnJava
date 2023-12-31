import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class Sprint3GUI extends JFrame {
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

    public Sprint3GUI() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setContentPane(MainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        btnSubmit.addActionListener(e -> {

            String firstName = textField1.getText();
            String surName = textField2.getText();
            String email = textField3.getText();
            String newPassword = new String(passwordField1.getPassword());
            String password = new String(passwordField2.getPassword());

            if (!password.equals(newPassword)) {
                JOptionPane.showMessageDialog(Sprint3GUI.this, "Passwords do not match.");
                
            } else if (firstName.isEmpty() || surName.isEmpty() || email.isEmpty() || newPassword.isEmpty()) {
                JOptionPane.showMessageDialog(Sprint3GUI.this, "Please fill in all empty spaces.");
                
            } else {
                try {
                    FileWriter infoWriter = new FileWriter("src/info.txt", true);
                    infoWriter.write("First Name: " + firstName + "\n");
                    infoWriter.write("Surname: " + surName + "\n");
                    infoWriter.write("Email: " + email + "\n");
                    infoWriter.write("Password Hash: " + password.hashCode() + "\n" +
                            "---------------------------------- \n");
                    infoWriter.close();

                    JOptionPane.showMessageDialog(Sprint3GUI.this, "User successfully created");
                    textField1.setText(" ");
                    textField2.setText(" ");
                    textField3.setText(" ");
                    passwordField1.setText(null);
                    passwordField2.setText(null);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }}
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Sprint3GUI::new);
    }
}

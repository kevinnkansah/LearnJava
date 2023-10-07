import javax.swing.*;

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
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Sprint2GUI::new);
    }
}

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
    JPanel Panelmain;
    JLabel Labellogin;
    JTextField textField;
    JPasswordField passwordField;
    JButton signin;

    public login(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(300,300);
        this.setResizable(false);

        Panelmain = new JPanel();
        Panelmain.setSize(300,300);
        Panelmain.setBackground(Color.PINK);
        Panelmain.setLayout(null);

        Labellogin = new JLabel();
        Labellogin.setBounds(0,20,300,20);
        Labellogin.setText("Login");
        Labellogin.setHorizontalAlignment(SwingConstants.CENTER);
        Panelmain.add(Labellogin);

        textField = new JTextField();
        textField.setText("Enter ID");
        textField.setBounds(50,80,150,20);
        Panelmain.add(textField);

        passwordField = new JPasswordField();
        passwordField.setText("Enter Password");
        passwordField.setBounds(50,100,150,20);
        Panelmain.add(passwordField);

        signin = new JButton();
        signin.setText("Sign In");
        signin.setBounds(50,150,100,20);
        Panelmain.add(signin);
                                                            // Need the ID and PW for complete sign in button
                                                            // If don't have, we can't add ActionListener for button

        this.add(Panelmain);

        this.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApp {

    private JFrame frame;

    public static void main(String[] args) {
        LoginApp app = new LoginApp();
        app.createAndShowGUI();
    }

    private void createAndShowGUI() {
        frame = new JFrame("Form Login");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(255, 255, 255));
        frame.add(panel);
        placeComponents(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(24, 119, 242));
        headerPanel.setPreferredSize(new Dimension(400, 100));
        JLabel headerLabel = new JLabel("MODUL 6");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 40));
        headerPanel.add(headerLabel);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        JTextField userText = new JTextField(20);
        userText.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        userText.setBorder(BorderFactory.createTitledBorder("Username(admin)"));
        formPanel.add(userText);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        passwordText.setBorder(BorderFactory.createTitledBorder("Password(password)"));
        formPanel.add(passwordText);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton loginButton = new JButton("Sign In");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setBackground(new Color(24, 119, 242));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        formPanel.add(loginButton);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JLabel messageLabel = new JLabel("");
        messageLabel.setForeground(Color.RED);
        messageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        formPanel.add(messageLabel);

        panel.add(headerPanel, BorderLayout.NORTH);
        panel.add(formPanel, BorderLayout.CENTER);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());

                if (user.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login berhasil!");
                    frame.dispose();
                    openNewForm();

                } else {
                    messageLabel.setText("Username atau Password salah");
                }
            }
        });
    }

    private void openNewForm() {
        JFrame newFrame = new JFrame("Form2");
        newFrame.setSize(400, 200);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel newPanel = new JPanel();
        newPanel.setLayout(new BoxLayout(newPanel, BoxLayout.Y_AXIS));
        newPanel.setBackground(new Color(60, 63, 65));
        newPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        newFrame.add(newPanel);

        JLabel welcomeLabel = new JLabel("Hallo !");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        newPanel.add(welcomeLabel);
        newPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        JButton backButton = new JButton("Kembali");
        backButton.setFont(new Font("Arial", Font.BOLD, 14));
        backButton.setBackground(new Color(24, 119, 242));
        backButton.setForeground(Color.WHITE);
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        newPanel.add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFrame.dispose();
                createAndShowGUI();
            }
        });

        newFrame.setLocationRelativeTo(null);
        newFrame.setVisible(true);
    }
}

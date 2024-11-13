import javax.swing.*;
import java.awt.*;

public class Tugas3 {
    private JFrame frame;
    private JPanel mainPanel, loginPanel, registerPanel;
    private CardLayout cardLayout;

    public Tugas3() {
        frame = new JFrame("Manipulator Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        buatPanelLogin();
        buatPanelRegister();

        mainPanel.add(loginPanel, "Login");
        mainPanel.add(registerPanel, "Daftar");

        frame.add(mainPanel);
        frame.setVisible(true);
        cardLayout.show(mainPanel, "Login");
    }

    private void buatPanelLogin() {
        loginPanel = new JPanel(new BorderLayout(10, 10));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel loginLabel = new JLabel("LOGIN", JLabel.CENTER);
        loginLabel.setFont(new Font("Arial", Font.BOLD, 18));
        loginPanel.add(loginLabel, BorderLayout.NORTH);

        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        fieldsPanel.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        JTextField emailField = new JTextField(20);
        fieldsPanel.add(emailField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        fieldsPanel.add(new JLabel("Sandi:"), gbc);

        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(20);
        fieldsPanel.add(passwordField, gbc);

        JPanel buttonPanel = new JPanel(new BorderLayout());

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Login dah bisa rek!"));

        JPanel buttonAlignPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        buttonAlignPanel.add(loginButton);
        buttonPanel.add(buttonAlignPanel, BorderLayout.WEST);

        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        footerPanel.add(new JLabel("アカウントを持っていません"));
        
        JButton switchToRegister = new JButton("Mendaftar");
        switchToRegister.addActionListener(e -> cardLayout.show(mainPanel, "Daftar"));
        footerPanel.add(switchToRegister);
        buttonPanel.add(footerPanel, BorderLayout.SOUTH);
        loginPanel.add(fieldsPanel, BorderLayout.CENTER);
        loginPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void buatPanelRegister() {
        registerPanel = new JPanel(new BorderLayout(10, 10));
        registerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel registerLabel = new JLabel("MENDAFTAR", JLabel.CENTER);
        registerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        registerPanel.add(registerLabel, BorderLayout.NORTH);

        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        fieldsPanel.add(new JLabel("Name Panjang:"), gbc);

        gbc.gridx = 1;
        JTextField nameField = new JTextField(20);
        fieldsPanel.add(nameField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        fieldsPanel.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        JTextField emailField = new JTextField(20);
        fieldsPanel.add(emailField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        fieldsPanel.add(new JLabel("Sandi:"), gbc);

        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(20);
        fieldsPanel.add(passwordField, gbc);

        JPanel buttonPanel = new JPanel(new BorderLayout());

        JButton registerButton = new JButton("Mendaftar");
        registerButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Daftar sukses cik!"));

        JPanel buttonAlignPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        buttonAlignPanel.add(registerButton); 
        buttonPanel.add(buttonAlignPanel, BorderLayout.WEST);

        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        footerPanel.add(new JLabel("アカウントがあります"));
        
        JButton switchToLogin = new JButton("Login");
        switchToLogin.addActionListener(e -> cardLayout.show(mainPanel, "Login"));
        footerPanel.add(switchToLogin);
        buttonPanel.add(footerPanel, BorderLayout.SOUTH);
        registerPanel.add(fieldsPanel, BorderLayout.CENTER);
        registerPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Tugas3();
    }
}

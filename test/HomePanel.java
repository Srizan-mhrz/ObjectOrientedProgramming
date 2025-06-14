package test;




import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {
    public HomePanel() {
        setLayout(new BorderLayout());

        JLabel welcome = new JLabel("Welcome Kamlesh", JLabel.CENTER);
        welcome.setFont(new Font("Segoe UI", Font.BOLD, 24));
        welcome.setForeground(new Color(51, 153, 255));

        JLabel subtitle = new JLabel("Let's see your records!!", JLabel.CENTER);
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subtitle.setForeground(new Color(102, 153, 255));

        JPanel profilePanel = new JPanel(new GridLayout(5, 2, 10, 10));
        profilePanel.setBorder(BorderFactory.createEmptyBorder(40, 100, 40, 100));

        JLabel profileTitle = new JLabel("Your Profile");
        profileTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
        profileTitle.setForeground(new Color(51, 153, 255));
        profilePanel.add(profileTitle);
        profilePanel.add(new JLabel(""));

        profilePanel.add(new JLabel("Name:"));
        profilePanel.add(new JLabel("Kamlesh"));

        profilePanel.add(new JLabel("Age:"));
        profilePanel.add(new JLabel("29"));

        profilePanel.add(new JLabel("Gender:"));
        profilePanel.add(new JLabel("Male"));

        profilePanel.add(new JLabel("Blood group:"));
        profilePanel.add(new JLabel("B+"));

        add(welcome, BorderLayout.NORTH);
        add(subtitle, BorderLayout.CENTER);
        add(profilePanel, BorderLayout.SOUTH);
    }
}


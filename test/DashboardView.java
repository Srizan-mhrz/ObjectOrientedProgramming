package test;

import javax.swing.*;
import java.awt.*;

public class DashboardView extends JFrame {
    public JPanel contentPanel;
    public JLabel homeLabel, recordLabel, historyLabel, medicineLabel, doctorLabel;

    public DashboardView() {
        setTitle("Patient Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);

        // Left Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(0, 102, 153));
        sidebar.setPreferredSize(new Dimension(200, getHeight()));
        sidebar.setLayout(new GridLayout(5, 1));

        homeLabel = new JLabel("  Home");
        recordLabel = new JLabel("  My Record");
        historyLabel = new JLabel("  My History");
        medicineLabel = new JLabel("  Medicine");
        doctorLabel = new JLabel("  View Doctor");

        for (JLabel label : new JLabel[]{homeLabel, recordLabel, historyLabel, medicineLabel, doctorLabel}) {
            label.setForeground(new Color(153, 204, 255));
            label.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            sidebar.add(label);
        }

        // Main content area
        contentPanel = new JPanel(new CardLayout());

        add(sidebar, BorderLayout.WEST);
        add(contentPanel, BorderLayout.CENTER);
    }
}

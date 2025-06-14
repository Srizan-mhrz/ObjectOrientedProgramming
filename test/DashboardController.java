package test;

import test.HomePanel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DashboardController {
    private DashboardView view;

    public DashboardController(DashboardView view) {
        this.view = view;

        // Create Panels
        view.contentPanel.add(new HomePanel(), "Home");
       
    }

    private void setupLabel(JLabel label, String panelName) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cl = (CardLayout) view.contentPanel.getLayout();
                cl.show(view.contentPanel, panelName);
            }
        });
    }
}

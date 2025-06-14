package test;

import test.DashboardView;
import test.DashboardController;

public class Main {
    public static void main(String[] args) {
        DashboardView view = new DashboardView();
        DashboardController controller = new DashboardController(view);
        controller.setVisible(true);
    }
}

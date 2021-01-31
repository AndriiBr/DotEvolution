package Version2;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        WorkField wf = new WorkField();

        this.setTitle("DotEvolution");
        this.add(wf);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setFocusable(false);
        this.setResizable(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();

    }
}

package Version2;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("DotEvolution");
        setSize(201, 201);
        setLocation(450, 150);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        add(new WorkField());

    }

    public static void main(String[] args) {

        MainWindow mw = new MainWindow();

    }
}

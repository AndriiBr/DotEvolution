package Version2;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    static int generalWindowSize = 603;

    static int getGeneralWindowSize() {
        return generalWindowSize;
    }

    public MainWindow() {
        WorkField wf = new WorkField();
        setTitle("DotEvolution");
        setSize(generalWindowSize, generalWindowSize);
        setLocation(450, 150);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(wf);
        getContentPane().setBackground(Color.white);
        //add(new WorkField());

    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();

    }
}

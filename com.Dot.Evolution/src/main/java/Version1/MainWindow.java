package Version1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("DotEvolution");
        setSize(201, 201);
        setLocation(450,150);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        add(new DotRender());
        //add(new DotRenderPanel());
        repaint();
        getContentPane().setBackground(Color.white);
        setVisible(true);

        TicksEngine generalEngine = new TicksEngine();
        generalEngine.tick();

    }
}

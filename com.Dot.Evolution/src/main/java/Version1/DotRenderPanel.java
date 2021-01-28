package Version1;

import javax.swing.*;
import java.awt.*;

public class DotRenderPanel extends JPanel {


    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,this.getWidth(), this.getHeight());

        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 1, 1);
    }
}

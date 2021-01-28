package Version1;

import javax.swing.*;
import java.awt.*;

public class DotRender extends JComponent {

    private int x;
    private int y;
    public boolean isRunning = true;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (isRunning) {
            for (int i = 0; i < 150; i++) {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, 4, 4);
            }
        }
    }
}

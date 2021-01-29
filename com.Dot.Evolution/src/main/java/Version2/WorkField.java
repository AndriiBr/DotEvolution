package Version2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class WorkField extends JPanel implements ActionListener {
    private final int dotSize = 8; //
    private Timer timer;
//    private boolean run = false;
//    private boolean stop = false;
    private boolean isRunning = true;
    final int numberOfDots = 10;

    ArrayList<GeneralDot> dots = new ArrayList<>();

    public WorkField() {
        setBackground(Color.white);
        initEvolution();
//        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }

    //запуск обновления итераций точек
    public void initEvolution(){
        timer = new Timer(250,this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isRunning) {
            g.setColor(Color.GREEN);
            g.drawLine(101, 0,101, 201);
            g.drawLine(0, 101,201, 101);
            for (int i = 0; i < dots.size(); i++) {
                g.setColor(Color.black);
                g.fillRect(dots.get(i).PositionX, dots.get(i).PositionY, dotSize-1, dotSize-1);
            }
        } else {
            //Эта часть пока что не реализована!!!!
            String str = "Evolution Over";
            g.setColor(Color.black);
            g.drawString(str, 201/2,201/2);
        }
    }

    //метод генерации новых точек и определения их передвижения.
    public void dotGenerate () {
        while(dots.size() < numberOfDots) {
            GeneralDot a = new GeneralDot();
            dots.add(a);
        }

        int i = 0;
        while(i < dots.size()) {
            dots.get(i).move();

            System.out.println("Dot" + i + ": ");
            System.out.println("Current evolution factor = " + new BigDecimal(dots.get(i).EvolutionFactor).setScale(2, RoundingMode.HALF_UP).doubleValue());
            System.out.println("x = " + dots.get(i).PositionX + " y = " + dots.get(i).PositionY + " Life = " + dots.get(i).LifeTime);

            i++;
        }
        System.out.println("------------------------");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isRunning) {
            dotGenerate();

        }
        repaint();
    }

    //временный класс запуска/остановки приложения с кнопки UP/DOWN
//    class FieldKeyListener extends KeyAdapter {
//        @Override
//        public void keyPressed(KeyEvent e) {
//            super.keyPressed(e);
//            int key = e.getKeyCode();
//            if (key == KeyEvent.VK_UP && !stop) {
//                run = true;
//                stop = false;
//            }
//            if (key == KeyEvent.VK_DOWN && !run) {
//                stop = true;
//                run = false;
//            }
//        }
//    }
}

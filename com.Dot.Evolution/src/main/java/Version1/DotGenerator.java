package Version1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class DotGenerator {

    ArrayList<Dot> dots = new ArrayList<>(3);
    ArrayList<DotRender> render = new ArrayList<>();

    public void dotGenerate() {

        while(dots.size() < 3) {
            Dot a = new Dot();
            dots.add(a);
        }

        int i = 0;
        while(i < dots.size()) {
            dots.get(i).move();

            DotRender b = new DotRender();
            b.setX(dots.get(i).PositionX);
            b.setY(dots.get(i).PositionY);

            render.add(b);

            System.out.println("Dot" + i + ": ");
            System.out.println("Current evolution factor = " + new BigDecimal(dots.get(i).EvolutionFactor).setScale(2, RoundingMode.HALF_UP).doubleValue());
            System.out.println("x = " + dots.get(i).PositionX + " y = " + dots.get(i).PositionY + " Life = " + dots.get(i).LifeTime);

            i++;
        }
        System.out.println("------------------------");
    }

    public ArrayList<DotRender> getRender() {
        return render;
    }
}

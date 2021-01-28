package Version1;

public class TicksEngine {

    DotGenerator d = new DotGenerator();

    public void tick() {
        try {
            while (true) {

                d.dotGenerate();

                Thread.sleep(5000); //Sample: Thread.sleep(100); 0.1 second sleep
            }
        } catch (InterruptedException ex) {
            //SomeCatching
        }

    }
}

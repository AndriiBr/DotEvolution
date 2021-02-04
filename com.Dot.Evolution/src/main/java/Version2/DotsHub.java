package Version2;

import java.util.ArrayList;
import java.util.List;

//Singleton. Example of this class can be created only once.
public class DotsHub {

    private static DotsHub instance;
    private List<GeneralDot> dotsHub = new ArrayList<>();

    private DotsHub() {
    }

    public static DotsHub getSingleton() {
        if (instance == null) {
            instance = new DotsHub();
        }
        return instance;
    }

    public List<GeneralDot> getDotHub() {
        return this.dotsHub;
    }
}

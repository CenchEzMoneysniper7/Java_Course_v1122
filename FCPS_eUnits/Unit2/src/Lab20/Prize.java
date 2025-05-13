package Lab20;
import java.awt.Color;

public class Prize extends Spot {
    public Prize(double x, double y, double r, Color c) {
        super(x, y, r, c);
    }

    public void lightup() {
        setMyColor(Color.YELLOW);
    }
}

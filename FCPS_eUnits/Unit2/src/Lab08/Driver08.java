import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;

public class Driver08 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flower Turtles");
        frame.setSize(700, 200);
        frame.setLocation(200, 100);
        frame.setContentPane(new TurtlePanel()); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Turtle.setCrawl(true);   
        Turtle.clear(Color.white); 

        FlowerTurtle f1 = new FlowerTurtle(100, 45, Color.red);
        FlowerTurtle f2 = new FlowerTurtle(200, 45, Color.yellow);
        FlowerTurtle f3 = new FlowerTurtle(300, 45, Color.blue);
        FlowerTurtle f4 = new FlowerTurtle(400, 45, Color.black);

        f1.drawShape();
        f2.drawShape();
        f3.drawShape();
        f4.drawShape();
    }
}


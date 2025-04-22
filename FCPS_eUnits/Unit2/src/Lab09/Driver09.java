import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;

public class Driver09 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Polygon Turtles");
        frame.setSize(400, 300);
        frame.setLocation(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setContentPane(new TurtlePanel());
        frame.setVisible(true); 
        Turtle.clear(Color.white); 

        TwistyTurtle T1 = new TwistyTurtle(1);
        TwistyTurtle T2 = new TwistyTurtle(100,250,90,2);
        TwistyTurtle T3 = new TwistyTurtle(500,350,90,3);

        //T1.drawShape();
        //T2.drawShape();
        //T3.drawShape();

        Thread t1 =new Thread(T1);
        Thread t2 =new Thread(T2);
        Thread t3 =new Thread(T3);
        
        t1.start();
        t2.start();
        t3.start();
    }
}

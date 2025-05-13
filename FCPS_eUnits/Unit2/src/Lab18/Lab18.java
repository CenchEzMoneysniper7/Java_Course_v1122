import javax.swing.*;
import java.awt.*;

public class Lab18 extends JPanel {
    public Lab18() {
        super();
        Turtle.clear(Color.BLACK); // 清空畫布背景
        Turtle t = new Turtle();
        t.turnLeft(5);
        for (int k = 0; k < 4; k++) {
            t.forward(100);
            t.turnLeft(90);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Turtle.getImage(), 0, 0, getWidth(), getHeight(), null);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Unit2, Lab12");
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(new Lab18());
        f.setVisible(true);
    }
}

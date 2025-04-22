
import javax.swing.*;
import java.awt.*;

public class TurtlePanel extends JPanel {

    public TurtlePanel() {
        setBackground(Color.WHITE);  // 設定背景顏色
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(700, 400);  // 畫布的預設大小
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 如果你要自訂 Turtle 畫圖的行為，可以在這裡畫
        // 但如果 Turtle 系統會自己畫，你不需要改這裡
    }
}

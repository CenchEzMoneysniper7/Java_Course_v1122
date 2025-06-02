package Taiwanflag;
import java.awt.*;
import javax.swing.*;
import java.awt.*;

public class TaiwanFlag extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 畫紅底
        g2.setColor(Color.RED);
        g2.fillRect(0, 0, 600, 400);

        // 畫藍底
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, 300, 200);

        // 星形中心點
        double cx = 150, cy = 100;

        // ✅ 最終微調參數
        double rayLength = 71;               // ⭐ 最終星光長度 → 貼齊藍底邊界
        double baseRadius = 37.5;            // 光芒底部圓
        double startAngle = Math.toRadians(-90); // 第一條垂直向上
        double deltaAngle = Math.toRadians(30);  // 每條光芒 30°
        double spread = Math.toRadians(15);      // 光芒展角 ±15°

        for (int i = 0; i < 12; i++) {
            double angle = startAngle + i * deltaAngle;

            // 尖端
            double tipX = cx + rayLength * Math.cos(angle);
            double tipY = cy + rayLength * Math.sin(angle);

            // 底部點
            double leftX = cx + baseRadius * Math.cos(angle + spread);
            double leftY = cy + baseRadius * Math.sin(angle + spread);
            double rightX = cx + baseRadius * Math.cos(angle - spread);
            double rightY = cy + baseRadius * Math.sin(angle - spread);

            Polygon triangle = new Polygon();
            triangle.addPoint((int) tipX, (int) tipY);
            triangle.addPoint((int) leftX, (int) leftY);
            triangle.addPoint((int) rightX, (int) rightY);

            g2.setColor(Color.WHITE);
            g2.fillPolygon(triangle);
        }

        // 藍圓（外圈）
        int blueR = (int) Math.round(42.5);
        g2.setColor(Color.BLUE);
        g2.fillOval((int) (cx - blueR), (int) (cy - blueR), blueR * 2, blueR * 2);

        // 白圓（內圈）
        int whiteR = (int) Math.round(37.5);
        g2.setColor(Color.WHITE);
        g2.fillOval((int) (cx - whiteR), (int) (cy - whiteR), whiteR * 2, whiteR * 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("中華民國國旗");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setContentPane(new TaiwanFlag());
        frame.setVisible(true);
    }
}

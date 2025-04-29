package Lab13;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class ProjectPanel extends JPanel {
   private static final ImageIcon Thomas = new ImageIcon("src/lab02/tj.jpg"); // 換成你自己的圖片路徑
   private BufferedImage myImage;
   private Graphics2D myBuffer;
   private Timer t1, t2;
   private int xPos = 50;
   private int yPos = 180;

   public ProjectPanel() {
      myImage = new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
      myBuffer = (Graphics2D) myImage.getGraphics();
      myBuffer.setColor(Color.WHITE);
      myBuffer.fillRect(0, 0, 700, 500);

      t1 = new Timer(120, new Listener_1());
      t2 = new Timer(3000, new Listener_2()); // 延遲事件

      t1.start();
   }

   public void paintComponent(Graphics g) {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }

   private class Listener_1 implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         int[] xPoints = { xPos, xPos + 50, xPos - 50, xPos, xPos + 50 };
         int[] yPoints = { yPos, yPos + 50, yPos + 50, yPos + 100, yPos + 150 };

         myBuffer.setColor(Color.GRAY);
         myBuffer.fillRect(0, 0, 700, 350);

         myBuffer.setColor(Color.DARK_GRAY);
         myBuffer.fillRect(0, 335, 700, 500);

         myBuffer.drawImage(Thomas.getImage(), xPos - 40, 50, 75, 125, null);

         myBuffer.setStroke(new BasicStroke(10.0f));
         myBuffer.drawPolyline(xPoints, yPoints, yPoints.length);

         repaint();

         xPos += 5;

         if (xPos >= 200) {
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.setColor(Color.RED);
            myBuffer.drawString("猜猜這是第幾次出現呢？", 300, 150);
            myBuffer.drawOval(250, 80, 400, 100);
            repaint();

            t1.stop();
            t2.start();
         }
      }
   }

   private class Listener_2 implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         // 可以在這裡加入第二階段動畫或重啟等邏輯
         t2.stop();
         xPos = 50;  // 重設位置
         t1.start(); // 再次啟動動畫
      }
   }
}

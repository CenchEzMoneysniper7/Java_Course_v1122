package Lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class PrizePanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);

   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot pd;
   private Timer t;
   private int score;    // 加分數！

   public PrizePanel()
   {
      myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, FRAME, FRAME);

      int xPos = (int)(Math.random() * (FRAME - 100) + 50);
      int yPos = (int)(Math.random() * (FRAME - 100) + 50);
      ball = new Ball(xPos, yPos, 50, Color.BLACK);

      int pdX = (int)(Math.random() * (FRAME - 20) + 10);
      int pdY = (int)(Math.random() * (FRAME - 20) + 10);
      pd = new Polkadot(pdX, pdY, 20, Color.GREEN);

      score = 0;   // 初始分數0

      t = new Timer(3, new Listener());   // 小改：Timer間隔變3ms，速度變更快
      t.start();
   }

   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }

   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME, FRAME);

         ball.move(FRAME, FRAME);
         ball.draw(myBuffer);
         pd.draw(myBuffer);

         collide(ball, pd);

         // 畫分數
         myBuffer.setColor(Color.BLACK);
         myBuffer.setFont(new Font("SansSerif", Font.BOLD, 18));
         myBuffer.drawString("Score: " + score, 10, 25);

         repaint();
      }
   }

   private void collide(Ball b, Polkadot pd)
   {
      double d = distance(b.getX(), b.getY(), pd.getX(), pd.getY());

      if (d <= b.getRadius() + pd.getRadius())
      {
         pd.jump(FRAME, FRAME);
         score++;    // 碰到小圓點，分數加1
      }
   }

   private double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
   }
}

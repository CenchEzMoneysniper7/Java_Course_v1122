
   package KarelProject;
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class KarelPanel extends JPanel
   {
      private static final int WIDTH = 395, HEIGHT = 391; //constants
      private static final Color BACKGROUND = new Color(204, 204, 204);
   
      private int xPos, yPos, dir; //fields
      private ImageIcon[] myArray;
      private BufferedImage myImage;
      private Graphics myBuffer;
       public KarelPanel()
      {
         myImage =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myArray = new ImageIcon[4];
         myArray[0] = new ImageIcon("C:\\Users\\Lee hsiang\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Midterm\\KarelProject\\karele.gif");   //east
         myArray[1] = new ImageIcon("C:\\Users\\Lee hsiang\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Midterm\\KarelProject\\kareln.gif");   //north
         myArray[2] = new ImageIcon("C:\\Users\\Lee hsiang\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Midterm\\KarelProject\\karelw.gif");   //west
         myArray[3] = new ImageIcon("C:\\Users\\Lee hsiang\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Midterm\\KarelProject\\karels.gif");   //south
         dir = 0;     //start facing east
         xPos = 5;    //starting xPos
         yPos = HEIGHT - 3 - myArray[dir].getImage().getHeight(null); //starting yPos
         Timer t = new Timer(250, new Listener());
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
            myBuffer.fillRect(0, 0, WIDTH, HEIGHT);
            myBuffer.setColor(Color.red);
            for(int x = 17; x < WIDTH; x += 30) //vertical lines
            {
               myBuffer.drawLine(x,0, x, HEIGHT);
            }
            for(int y = 9; y < HEIGHT; y += 28) //horizontal lines
            {
               myBuffer.drawLine(0,y,WIDTH,y);
            }
            myBuffer.fillRect(107, 121, 180, 56);
            myBuffer.setColor(Color.black);
            myBuffer.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 20));
            myBuffer.drawString("Karel the Robot", 125, 155);
            
         	switch (dir) {
               case 0:
                  xPos=xPos+30;
                  break;
            
               case 1:
                  yPos=yPos-28;
                  break;
               case 2:
                  xPos=xPos-30;
                  break;
               case 3:
                  yPos=yPos+28;
                  break;   
            }
                 if (yPos >= 381) { // 朝牆等(25,29)    左下
                     if (dir != 0) {
                        xPos = (377 - Math.round(myArray[0].getImage().getWidth(null) / 2));
                        yPos = (373 - Math.round(myArray[0].getImage().getHeight(null) / 2));
                        dir = 0;
                     }
                  }

                  if (xPos >= 395) { // 朝牆(29,25)      右下
                     if (dir != 1) {
                        xPos = (377 - Math.round(myArray[1].getImage().getWidth(null) / 2));
                        yPos = (373 - Math.round(myArray[1].getImage().getHeight(null) / 2));
                        dir = 1;
                     }
                  }

                  if (yPos <= -4) { // 朝牆(25,29)       上上
                     if (dir != 2) {
                        xPos = (377 - Math.round(myArray[2].getImage().getWidth(null) / 2));
                        yPos = (373 - Math.round(myArray[2].getImage().getHeight(null) / 2));
                        dir = 2;
                     }
                  }

                  if (xPos <= -3 && dir != 0) { // 朝牆(29,25)    左上
                     xPos = (17 - Math.round(myArray[3].getImage().getWidth(null) / 2));
                     yPos = (9 - Math.round(myArray[3].getImage().getHeight(null) / 2));
                     dir = 3;
                  }

            myBuffer.drawImage(myArray[dir].getImage(), xPos, yPos, null);
            
            repaint();
         }
      }
   }
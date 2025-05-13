package Lab20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class PrizePanel extends JPanel {
    private static final int FRAME = 800;
    private static final Color BACKGROUND = new Color(204, 204, 204);
    private static final int num = 500;

    private BufferedImage myImage;
    private Graphics buffer;
    private Pinball pb;
    private Prize[] array;
    private Timer t;
    private int hits = 0;

    public PrizePanel() {
        myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        buffer = myImage.getGraphics();

        buffer.setColor(BACKGROUND);
        buffer.fillRect(0, 0, FRAME, FRAME);

        pb = new Pinball((int)(Math.random() + (FRAME - 100) + 50),(int)(Math.random() + (FRAME - 100) + 50),10,Color.BLACK);
        pb.setbound(FRAME, FRAME);

        array = new Prize[num];
        for (int k = 0; k < array.length; k++) {
            array[k] = new Prize(
                Math.random() * FRAME,
                Math.random() * FRAME,
                Math.random() * 15,
                Color.RED
            );
        }

        t = new Timer(5, new Listener());
        t.start();
    }

    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            buffer.setColor(Color.WHITE);
            buffer.fillRect(0, 0, FRAME, FRAME);

            for (int k = 0; k < num; k++) {
                if (pb.intersect(array[k]) && array[k].getMyColor() == Color.RED) {
                    array[k].lightup();
                }
                array[k].drawme(buffer);
            }

            pb.tick();
            pb.drawme(buffer);

            repaint();
        }
    }
}

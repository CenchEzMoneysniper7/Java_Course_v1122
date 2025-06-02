package KarelProject;
// Modified version for keyboard control only
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class KarelPanel1 extends JPanel implements KeyListener {
    private static final int WIDTH = 390;
    private static final int HEIGHT = 390;
    private static final int STEP = 30;
    private static final int GRID_START = 15;
    private static final Color BACKGROUND = new Color(204, 204, 204);

    private int xPos, yPos, dir = 0;
    private ImageIcon[] myArray;
    private BufferedImage myImage;
    private Graphics myBuffer;

    public KarelPanel1() {
        myImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();

        myArray = new ImageIcon[4];
        myArray[0] = new ImageIcon("C:\\Users\\Lee hsiang\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Midterm\\KarelProject\\karele.gif");   //east
        myArray[1] = new ImageIcon("C:\\Users\\Lee hsiang\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Midterm\\KarelProject\\kareln.gif");   //north
        myArray[2] = new ImageIcon("C:\\Users\\Lee hsiang\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Midterm\\KarelProject\\karelw.gif");   //west
        myArray[3] = new ImageIcon("C:\\Users\\Lee hsiang\\Documents\\GitHub\\Java_Course_v1122\\FCPS_eUnits\\Midterm\\KarelProject\\karels.gif"); 

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        addKeyListener(this);

        // 設定為左下角交叉點（線的交會處）
        xPos = GRID_START;
        yPos = HEIGHT - GRID_START;
        draw();
    }

    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }

    private void draw() {
        myBuffer.setColor(BACKGROUND);
        myBuffer.fillRect(0, 0, WIDTH, HEIGHT);
        myBuffer.setColor(Color.RED);

        for (int x = GRID_START; x < WIDTH; x += STEP)
            myBuffer.drawLine(x, 0, x, HEIGHT);
        for (int y = GRID_START; y < HEIGHT; y += STEP)
            myBuffer.drawLine(0, y, WIDTH, y);

        // 將角色圖示中心對齊交叉點
        myArray[dir].paintIcon(this, myBuffer, xPos - myArray[dir].getIconWidth() / 2, yPos - myArray[dir].getIconHeight() / 2);
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            if (xPos - STEP >= GRID_START) {
                xPos -= STEP;
                dir = 2;
            } else {
                System.out.println("警告：已到達左邊界");
            }
        } else if (key == KeyEvent.VK_RIGHT) {
            if (xPos + STEP < WIDTH) {
                xPos += STEP;
                dir = 0;
            } else {
                System.out.println("警告：已到達右邊界");
            }
        } else if (key == KeyEvent.VK_UP) {
            if (yPos - STEP >= GRID_START) {
                yPos -= STEP;
                dir = 1;
            } else {
                System.out.println("警告：已到達上邊界");
            }
        } else if (key == KeyEvent.VK_DOWN) {
            if (yPos + STEP < HEIGHT) {
                yPos += STEP;
                dir = 3;
            } else {
                System.out.println("警告：已到達下邊界");
            }
        } else if (key == KeyEvent.VK_SPACE) {
            xPos = GRID_START;
            yPos = HEIGHT - GRID_START;
            dir = 0;
            System.out.println("已重置到起點");
        }

        draw();
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}



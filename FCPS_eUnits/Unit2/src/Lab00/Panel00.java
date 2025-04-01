package Lab00;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*; 
public class Panel00 {
    public static void paintComponent(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(75, 50, 300, 125);
        g.setFont(new Font("serif",Font.BOLD,50));
        g.setColor(new Color(150,150,0));
        g.drawString("Hello World", 100, 150);
    }
    
}

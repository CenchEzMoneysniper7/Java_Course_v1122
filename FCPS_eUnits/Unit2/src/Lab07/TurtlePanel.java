   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import edu.fcps.Turtle;
public class TurtlePanel extends JPanel{
    public TurtlePanel(){
        Timer t = new Timer(10, new Listener());
        t.start();
    }
    public void paintComponent(Graphics g){
        g.drawImage(Turtle.getImage(),0,0,getWidth(),getHeight(),null);
    }
    private class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            repaint();
        }
    }
}
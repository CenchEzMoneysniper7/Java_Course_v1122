package Lab11;
import javax.swing.JFrame;

public class Lab11{
         public static void main(String[] args){
            JFrame frame =new JFrame("Lab11");
            frame.setSize(400,400);
            frame.setLocation(100,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new PinballPanel());
            frame.setVisible(true);
         }
}
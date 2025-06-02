   package KarelProject;
   import javax.swing.JFrame;
   public class Driver15
   {
      public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab15: Karel the Robot");
         frame.setSize(400, 400);
         frame.setLocation(175, 50);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new KarelPanel1());
         frame.setVisible(true);
      }
   }
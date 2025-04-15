import edu.fcps.Bucket;
import javax.swing.JFrame;

public class Driver04b {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Buckets");
        frame.setSize(600,400);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new BucketPanel());
        frame.setVisible(true);
        Bucket.setSpeed(5);
        Bucket.useTotal(false);
        Bucket five =new Bucket(5);
        Bucket four = new Bucket(4);
        Bucket three = new Bucket(3);
        
        five.fill();//5
        five.pourInto(four);
        four.spill();//1
        five.pourInto(three);
        four.fill();
        five.fill();//10
        four.spill();
        three.spill();
        five.pourInto(three);
        three.spill();//2
        five.pourInto(three);
        four.fill();
        five.fill();//11
        three.fill();//12
        three.spill();//9
        four.pourInto(three);
        four.spill();//8
        five.spill();
        four.fill();//7
        three.spill();
        five.spill();
           }
}

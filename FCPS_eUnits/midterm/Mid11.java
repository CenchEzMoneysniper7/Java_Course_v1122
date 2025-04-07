import edu.fcps.karel2.Display;

public class Mid11 {

    public static void main(String[] args) {
        Display.openDefaultWorld();
        Display.setSize(36, 32);
        Display.setSpeed(10); 
         
        Runnable e1 = new E(1, 18);
        Thread t1 = new Thread(e1);
        Runnable e2 = new E(7, 18);
        Thread t2 = new Thread(e2);
        Runnable c = new Calph(13, 18);
        Thread t3 = new Thread(c);
        Runnable five = new Five(19, 18);
        Thread t4 = new Thread(five);
        Runnable dash = new Hiven(7, 9);
        Thread t5 = new Thread(dash);
        Runnable two = new Two(13, 9);
        Thread t6 = new Thread(two);
        Runnable eight = new Eight(19, 9);
        Thread t7 = new Thread(eight);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}

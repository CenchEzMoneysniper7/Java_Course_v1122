import edu.fcps.karel2.Display;

public class Lab05 {
    public static void main(String[] args) {
        Display.openWorld("maps/shuttle.map");
        Display.setSize(10, 10);
        Display.setSpeed(10);
        Racer aa = new Racer(1);
        Racer ab = new Racer(4);
        Racer ac = new Racer(7);
        aa.shuttle(2 ,7 );
        aa.shuttle(4, 5);
        aa.shuttle(6, 3);
        aa.move();
        ab.shuttle(2 ,7 );
        ab.shuttle(4, 5);
        ab.shuttle(6, 3);
        ab.move();
        ac.shuttle(2 ,7 );
        ac.shuttle(4, 5);
        ac.shuttle(6, 3);
        ac.move();

    }
    
}

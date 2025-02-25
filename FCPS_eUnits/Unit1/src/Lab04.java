import edu.fcps.karel2.Display;

public class Lab04 {
    public static void takeTheField(Athlete arg)
    {
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.turnRight();
        arg.move();
        arg.move();
    }
    public static void main(String[] args) {
        Display.openWorld("maps/arena.map");
        Display.setSize(10, 10);
        Display.setSpeed(10);
        Athlete aa = new Athlete();
        Athlete ab = new Athlete();
        Athlete ac = new Athlete();
        Athlete ad = new Athlete();
        Athlete ae = new Athlete();
        Athlete af = new Athlete();
        Athlete coach = new Athlete();

        takeTheField(aa);
        takeTheField(ab);
        takeTheField(ac);
        takeTheField(ad);
        takeTheField(ae);
        takeTheField(af);
        takeTheField(coach);
        coach.turnAround();
        coach.move();
        coach.turnRight();
        coach.move();
        coach.move();
        coach.turnRight();
        aa.move();
        aa.move();
        aa.move();
        aa.move();
        aa.move();
        aa.turnLeft();
        aa.move();
        aa.turnAround();
        ab.move();
        ab.move();
        ab.move();
        ab.move();
        ab.turnRight();
        ac.move();
        ac.move();
        ac.move();
        ac.turnLeft();
        ac.move();
        ac.move();
        ac.turnAround();
        ad.move();
        ad.move();
        ad.move();
        ad.turnRight();
        ae.move();
        ae.move();
        ae.turnRight();
        af.move();
        af.turnLeft();
        af.move();
        af.turnAround();

    }
}

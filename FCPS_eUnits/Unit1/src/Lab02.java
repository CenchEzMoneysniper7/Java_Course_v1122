import edu.fcps.karel2.Display;

public class Lab02 {
    public static void main(String[] args) {
        Display.openWorld("maps/maze.map");
        Display.setSize(8,8);
        Athlete lisa = new Athlete();
        lisa.putAndMove();
        lisa.turnRight();
        lisa.putAndMove();
        lisa.turnRight();
        lisa.putAndMove();
        lisa.turnLeft();
        lisa.putAndMove();
        lisa.turnLeft();
        lisa.putAndMove();
        lisa.turnRight();
        lisa.putAndMove();
        lisa.putAndMove();
        lisa.turnRight();
        lisa.putAndMove();
        lisa.turnLeft();
        lisa.putAndMove();
        lisa.turnLeft();
        lisa.putAndMove();
        lisa.putAndMove();
        lisa.putAndMove();
        lisa.putAndMove();
        lisa.turnRight();
        lisa.putAndMove();
        lisa.putAndMove();

    }
}

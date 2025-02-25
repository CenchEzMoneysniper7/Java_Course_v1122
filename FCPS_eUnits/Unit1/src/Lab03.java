import edu.fcps.karel2.Display;

public class Lab03 {
    public static void main(String[] args) {
        Display.openWorld("maps/mountain.map");
        Display.setSize(16,16);
        Climber lisa = new Climber(8);
        
        lisa.turnRight();
        lisa.move();
        lisa.climbUpRight();
        lisa.climbUpRight();
        lisa.climbUpRight();
        lisa.climbDownRight();
        lisa.climbDownRight();
        lisa.pickBeeper();
        lisa.turnAround();
        lisa.climbUpLeft();
        lisa.climbUpLeft();
        lisa.climbDownLeft();
        lisa.climbDownLeft();
        lisa.climbDownLeft();
        lisa.move();
        lisa.putBeeper();
    }
}

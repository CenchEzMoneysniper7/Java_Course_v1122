import edu.fcps.karel2.Display;
public class StepClimber extends Climber
{
    public StepClimber(){}
    public StepClimber(int x)
    {
        super(x);
    }
    public void climbUpRight()
    {
        turnLeft();
        move();
        turnRight();
        move();
    }
    public void climbUpLeft()
    {
        turnRight();
        move();
        turnLeft();
        move();
    }
    public void climbDownRight()
    {
        move();
        turnRight();
        move();
        turnLeft();
    
    }
    public void climbDownLeft()
    {
        move();
        turnLeft();
        move();
        turnRight();
    
    }

    
}
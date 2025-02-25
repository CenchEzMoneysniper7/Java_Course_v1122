import edu.fcps.karel2.Display;

public class Racer extends Athlete 
{
    public Racer(int y)   
    {
        super(1,y,Display.EAST,Display.INFINITY);
    } 
    public void jumpRight()
    {
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }
    public void jumpLeft()
    {
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void sprint(int n)
    {
        for(int k=1;k<=n;k++)
            move();
    }
    public void pick(int n)
    {
        for(int k=1;k<=n;k++)
            pickBeeper();
    }
    public void put(int n)
    {
        for(int k=1;k<=n;k++)
            putBeeper();
    }
    public void shuttle(int spaces,int beepers)//spaces牆壁為基準
    {
        move();
        jumpRight();
        sprint(spaces);
        pick(beepers);
        turnAround();
        sprint(spaces);
        jumpLeft();
        move();
        put(beepers);
        turnAround();
    }
}

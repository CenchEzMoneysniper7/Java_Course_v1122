import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab10 {
    public static void main(String[] args) {
    String filename = JOptionPane.showInputDialog("What robot world?");
    Display.openWorld("maps/"+filename+".map");
    Display.setSize(10, 10);
    Display.setSpeed(10);
    Athlete doge = new Athlete(1,1,Display.NORTH,Display.INFINITY);
    while(!doge.nextToABeeper()){
        if(doge.rightIsClear()){
        doge.turnRight();
        }
        if(doge.frontIsClear()){
        doge.move();
        }
        if(!doge.frontIsClear() && !doge.rightIsClear()){
        doge.turnLeft();
        } 
      }
    }
}

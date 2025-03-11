import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab09 {
   public static void main(String[] args) {
    String filename = JOptionPane.showInputDialog("What robot world?");
    Display.openWorld("maps/"+filename+".map");
    Display.setSize(10, 10);
    Display.setSpeed(10);
    Athlete doge = new Athlete(1,1,Display.EAST,0);
    int[] counterAry = new int[10];
    for(int i=0;i<counterAry.length;i++){
        while(doge.nextToABeeper()){
            doge.pickBeeper();
            counterAry[i]++;
        }
        if(i>0){
        for(int j=0;j<counterAry[i-1];j++){
            doge.putBeeper();
        }
    }
        doge.move();
    }
   } 
}

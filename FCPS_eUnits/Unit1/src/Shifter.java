	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
      @Override
      public void workCorner() {
      }
      @Override
      public void moveOneBlock() {

      }
      @Override
      public void turnToTheRight() {
      }
      @Override
      public void turnToTheNorth() {
      }
      @Override
      public void run() {
         int[] counterAry = new int[10];
    for(int i=0;i<counterAry.length;i++){
        while(nextToABeeper()){
            pickBeeper();
            counterAry[i]++;
        }
        if(i>0){
        for(int j=0;j<counterAry[i-1];j++){
            putBeeper();
        }
    }
         move();
    }
      }
   	
   }
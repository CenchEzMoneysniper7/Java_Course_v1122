public class NewbieDancer extends Dancer {
    public NewbieDancer(int x,int y,int dir,int beep){
        super(x,y,dir,beep);
    }
    public NewbieDancer(){}
        public void danceStep(){
            for(int i=0;i<4;i++)
            move();
            turnLeft();
            move();
            turnAround();
            move();
            move();
            turnAround();
            move();
            turnLeft();
        }
}
import java.awt.Color;
public class TwistyTurtle extends Turtle implements Runnable{
    private double mySize;
    private Color myColor;
    private int drawmode;
    private int extension;
    public TwistyTurtle(int mode){
        super();
        drawmode =mode;
        mySize =30.0;
    }
    public TwistyTurtle(double size,int mode){
        super;
        drawmode =mode;
        mySize=size;
    }
    public TwistyTurtle(double x,double y,double heading,int mode){
        super(x,y,heading);
        drawmode =mode;
        mySize=size;
    }
    public void setSize(double size){
        mySize=size;
    }
    public void rotatetriangle(){
        for(int i=5;i<=400;i+=10){
            forward(i);
            turnLeft(123);
        }
    }
    public void rotate(){
        for(int i=0;i<=150;i+=2){
            forward(i);
            turnLeft(30);
        }
    }
    public void rotatesquare(){
        for(int i=25;i<=150;i+=5){
            forward(i);
            turnLeft(45);
            forward(i);
            turnLeft(90);
            forward(i);
            turnLeft(90);
            forward(i);
            turnLeft(90);
        }
    }
    public void FourhDraw(){
        for(int i=1;i<=5;i++){
            forward(150);
            turnLeft(150);
        }
    }
    public void octagon(){
        for(int i=1;i<=8;i++){
            forward(30);
            turnLeft(45);
        }
    }
    public void drawShape(){
        switch(drawmode){
            case 1:
                super.setColor(Color.orange);
                rotatetriangle();
                break;
                case 2:
                super.setColor(Color.black);
                rotate();
                break;
                case 3:
                super.setColor(Color.red);
                rotatesquare();
                break;
                case 4:
                super.setColor(Color.yellow);
                octagon();
                break;
            default:
                break;
        }
        }
        public  void run(){
            drawShape();
        }
    }

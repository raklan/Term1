import java.awt.*;
import java.util.Random;

public class Ball extends Oval{

    static Random gen = new Random();

    private int deltaX;
    private int deltaY;

    public Ball(int x,int y,int w,int h){
        super(x,y,w,h);
        this.setVisible(true);
        deltaX = gen.nextInt(50)+1;
        deltaY = gen.nextInt(50)+1;
        this.setBackground(Color.decode("#8700c6"));
    }
    public void move(Rectangle middle){

        if(this.getX()>=middle.getWidth()-this.getWidth()||this.getX()<=0)
            this.setDeltaX(this.getDeltaX()*-1);
        if(this.getY()>=middle.getHeight()-this.getHeight()||this.getY()<=0)
            this.setDeltaY(this.getDeltaY()*-1);
        this.setLocation(this.getX()+deltaX, this.getY()+deltaY);

    }
    public int getDeltaX(){
        return deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public void setDeltaX(int dx){
        deltaX = dx;
    }
    public void setDeltaY(int dy){
        deltaY = dy;
    }
    public void setDeltas(int dx, int dy){
        deltaX = dx;
        deltaY = dy;
    }
    public void reset(){
        this.setLocation(10,10);
        this.setDeltas(gen.nextInt(50)+1,gen.nextInt(20)+1);
    }
}

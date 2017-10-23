import java.awt.*;
import java.util.Random;

public class Ball extends Oval{

    static Random gen = new Random();

    private int deltaX;
    private int deltaY;
    private int initialX;
    private int initialY;

    private int top;
    private int bottom;
    private int left;
    private int right;

    public Ball(int x,int y,int w,int h, String c){
        super(x,y,w,h);

        this.setVisible(true);

        deltaX = gen.nextInt(50)+1;
        deltaY = gen.nextInt(50)+1;

        this.setBackground(Color.decode(c));

        initialX = x;
        initialY = y;

        top = this.getY();
        bottom = this.getY()+this.getHeight();
        left = this.getX();
        right = this.getX()+this.getWidth();
    }
    public void move(Rectangle middle, int otherTop, int otherBottom, int otherLeft, int otherRight){

        if(this.getX()>=middle.getWidth()-this.getWidth()||this.getX()<=0)
            this.setDeltaX(this.getDeltaX()*-1);
        if(this.getY()>=middle.getHeight()-this.getHeight()||this.getY()<=0)
            this.setDeltaY(this.getDeltaY()*-1);
        this.setLocation(this.getX()+deltaX, this.getY()+deltaY);

        //TopLeft
        if(this.bottom>otherTop&&this.bottom<otherBottom&&this.right>otherLeft&&this.right<otherRight) {
            this.setVisible(false);
            this.reset();
        }
        //TopRight
        if(this.bottom>otherTop&&this.bottom<otherBottom&&this.left>otherLeft&&this.left<otherLeft){
            this.setVisible(false);
            this.reset();
        }
        //BottomLeft
        if(this.top>otherTop&&this.top<otherBottom&&this.right>otherLeft&&this.right<otherRight){
            this.setVisible(false);
            this.reset();
        }
        //BottomRight
        if(this.top>otherTop&&this.top<otherBottom&&this.left>otherLeft&&this.left<otherRight){
            this.setVisible(false);
            this.reset();
        }

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

    public int getTop(){return top;}
    public int getBottom(){return bottom;}
    public int getLeft(){return left;}
    public int getRight(){return right;}


    public void reset(){
        this.setLocation(initialX,initialY);
        this.setDeltas(gen.nextInt(50)+1,gen.nextInt(20)+1);
        this.setVisible(true);
    }
}

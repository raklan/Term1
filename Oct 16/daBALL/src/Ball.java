import java.awt.*;
import java.util.Random;

public class Ball extends Oval{

    static Random gen = new Random();

    private int deltaX;
    private int deltaY;
    private final int initialX;
    private final int initialY;

    private int top;
    private int bottom;
    private int left;
    private int right;

    public boolean canMove;

    private int count;

    public Ball(int x,int y,int w,int h, String c){
        super(x,y,w,h);

        this.setVisible(true);

        deltaX = gen.nextInt(50)+1;
        deltaY = gen.nextInt(50)+1;

        this.setBackground(Color.decode(c));

        initialX = x;
        initialY = y;

        canMove = true;

        top = this.getY();
        bottom = this.getY()+this.getHeight();
        left = this.getX();
        right = this.getX()+this.getWidth();

        count = 0;
    }
    public void move(Rectangle middle){

        if(canMove) {

            if (this.getX() >= middle.getWidth() - this.getWidth() || this.getX() <= 0) {
                this.setDeltaX(this.getDeltaX() * -1);
                count++;
            }
            if (this.getY() >= middle.getHeight() - this.getHeight() || this.getY() <= 0) {
                this.setDeltaY(this.getDeltaY() * -1);
                count++;
            }
            this.setLocation(this.getX() + deltaX, this.getY() + deltaY);

            this.setSides(this.getY(), this.getY() + this.getHeight(), this.getX(), this.getX() + this.getWidth());

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

    public void setTop(int t){top = t;}
    public void setBottom(int b){bottom = b;}
    public void setLeft(int l){left = l;}
    public void setRight(int r){right = r;}

    public void setSides(int t, int b, int l, int r){
        top = t;
        bottom = b;
        left = l;
        right = r;
    }

       public void reset(){
        this.setLocation(initialX,initialY);
        this.setDeltas(gen.nextInt(50)+1,gen.nextInt(20)+1);
        this.setVisible(true);
        count = 0;
        canMove = true;
    }

    public boolean checkCollision(int otherTop, int otherBottom, int otherLeft, int otherRight){

        //TopLeft
        if (this.bottom > otherTop && this.bottom < otherBottom && this.right > otherLeft && this.right < otherRight) {
            this.setVisible(false);
            canMove = false;
            return true;
        }
        //TopRight
        if (this.bottom > otherTop && this.bottom < otherBottom && this.left > otherLeft && this.left < otherLeft) {
            this.setVisible(false);
            canMove = false;
            return true;
        }
        //BottomLeft
        if (this.top > otherTop && this.top < otherBottom && this.right > otherLeft && this.right < otherRight) {
            this.setVisible(false);
            canMove = false;
            return true;
        }
        //BottomRight
        if (this.top > otherTop && this.top < otherBottom && this.left > otherLeft && this.left < otherRight) {
            this.setVisible(false);
            canMove = false;
            return true;
        }
        else
            return false;

    }
    public int getCount(){
        return count;
    }
}

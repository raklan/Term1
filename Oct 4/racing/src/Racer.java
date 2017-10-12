import java.util.Random;

public class Racer extends EzImage{

    static Random gen = new Random();

    private int count;
    private int deltaX;
    private int deltaY;
    boolean isDone;
    int leg;

    public Racer(int x, int y, int w, int h, String i){

        super(x,y,w,h,i);
        count = 0;
        deltaX = 20;
        deltaY = 20;
        isDone = false;
        leg = 1;

        this.setDeltaX(gen.nextInt(20)+1);
        this.setDeltaY(this.getDeltaX());

    }

    public void move() {

        int x = this.getX();
        int y = this.getY();
        int leg = this.getLeg();

            if (leg == 1) {
                this.setLocation(x + deltaX, y);
                count++;
                if(this.getX()>=425) {
                    this.setLeg(leg + 1);
                    this.setImage("SpaceshipDown.png");
                }
            } else if (leg == 2) {
                this.setLocation(x, y + deltaY);
                count++;
                if(this.getY()>=425) {
                    this.setLeg(leg + 1);
                    this.setImage("SpaceshipLeft.png");
                }
            } else if (leg == 3) {
                this.setLocation(x - deltaX, y);
                count++;
                if(this.getX()<=25) {
                    this.setLeg(leg + 1);
                    this.setImage("SpaceshipUp.png");
                }
            } else if (leg == 4) {
                this.setLocation(x, y - deltaY);
                count++;
                if(this.getY()<=25) {
                    this.setLeg(leg + 1);
                    this.setImage("SpaceshipRight.png");
                }
            }
            else if(leg == 5)
                this.setDone(true);


    }

    public int getLeg(){
        return leg;
    }

    public void setLeg(int l){
        leg = l;
    }

    public boolean getDone(){
        return isDone;
    }

    public void setDone(boolean d){
        isDone = d;
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

    public void reset(){

        this.setDone(false);

        this.setLocation(25,25);

        this.setLeg(1);

        this.setImage("spaceshipRight.png");

        this.setDeltaX(gen.nextInt(20)+1);
        this.setDeltaY(this.getDeltaX());
    }
}

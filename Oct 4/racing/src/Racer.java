

public class Racer extends EzImage{

    private int count;
    private int deltaX;
    private int deltaY;

    public Racer(int x, int y, int w, int h, String i){

        super(x,y,w,h,i);
        count = 0;
        deltaX = 5;
        deltaY = -5;

    }
    public void move() {
        count ++;
        int x = this.getX();
        int y = this.getY();
        this.setLocation(x+deltaX, y+deltaY);
    }

}

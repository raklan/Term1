import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snowflake extends Rectangle{

    private static final int TEN = 1;
    private static final int EIGHT = 2;
    private static final int SIX = 3;
    private static final int FOUR = 4;
    private static final int THREE = 5;
    private static final int TWO = 6;

    private static int numOfFlakes = 0;

    static Random gen = new Random();

    private int numOfShapes = 0;
    private double angle = 0.0;
    private int deltaX;
    private int deltaY;

    public Snowflake(int x, int y, int ang, int type, int w){
        super(x,y,w,w);
        this.setBackground(new Color(1,1,1,1));
        while(numOfShapes<ang*2+4) {
            Polygon flake;
            switch (type) {
                case TEN:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, super.getHeight()/7, 10, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
                case EIGHT:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, super.getHeight()/7, 8, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
                case SIX:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, super.getHeight()/7, 6, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
                case FOUR:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, super.getHeight()/7, 4, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
                case THREE:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, super.getHeight()/7, 3, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
                case TWO:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, super.getHeight()/7, 2, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
            }

            numOfShapes++;

            angle = (angle + Math.PI / ang);
        }
        deltaX = gen.nextInt(2)+1;
        deltaY = gen.nextInt(4)+1;

        numOfFlakes++;
    }

    public boolean moveFlake(int h, int w){
        this.setLocation(this.getX()+deltaX, this.getY()+deltaY);
        if(this.getX()>w||this.getY()>h)
            return true;
        else
            return false;
    }
    public void setDeltas(int dx, int dy){
        deltaX = dx;
        deltaY = dy;
    }
    public void spawn(){
        int x;
        int y;
        int change;

        change = gen.nextInt(2);

        x = gen.nextInt(900);
        y = gen.nextInt(900);

        if(x>0&&y>0){
            if(change==0) {
                x *= -1;
                x-=this.getWidth();
            }
            else if(change==1) {
                y *= -1;
                y-=this.getHeight();
            }
            else{
                x*=-1;
                y*=-1;
            }

        }

        this.setLocation(x,y);
    }


}

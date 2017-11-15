import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snowflake extends Rectangle{

    private static final int TEN = 1;
    private static final int EIGHT = 2;
    private static final int SIX = 3;

    private static int numOfFlakes = 0;

    static Random gen = new Random();

    private int numOfShapes = 0;
    private double angle = 0.0;
    private int deltaX;
    private int deltaY;

    public Snowflake(int x, int y, int ang, int type){
        super(x,y,200,200);
        this.setBackground(new Color(1,1,1,1));
        while(numOfShapes<ang*2+4) {
            Polygon flake;
            switch (type) {
                case TEN:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, super.getHeight()/6, 10, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
                case EIGHT:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, super.getHeight()/6, 8, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
                case SIX:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, super.getHeight()/6, 6, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
            }

            numOfShapes++;

            angle = (angle + Math.PI / ang);
        }
        deltaX = gen.nextInt(3)+1;
        deltaY = gen.nextInt(5)+1;

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

}

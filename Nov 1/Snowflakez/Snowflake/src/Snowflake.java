import javax.swing.*;
import java.awt.*;

public class Snowflake extends Rectangle{

    private int numOfShapes = 0;

    private double angle = 0.0;

    public Snowflake(int x, int y){
        super(x,y,250,250);
        while(numOfShapes<10) {

            Polygon flake = new Polygon(125, 125, 50, 8, angle, Color.decode("#ffffff"));

            this.add(flake, 0);
            numOfShapes++;

            angle = (angle + Math.PI / 5);
        }
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Snow!!!!");
        win.setBounds(100,100,1000,1000);
        win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
        win.setLayout(null);
        win.setVisible(true);

        Snowflake s1 = new Snowflake(200,200);
        Snowflake s2 = new Snowflake(600,200);
        win.add(s1,0);
        win.add(s2,0);

        win.repaint();
    }
}

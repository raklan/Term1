import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snowflake extends Rectangle{

    private static final int TEN = 1;
    private static final int EIGHT = 2;
    private static final int SIX = 3;

    private static int fps = 40;

    private static int numOfFlakes = 0;

    static Random gen = new Random();

    static Snowflake[] flakes = new Snowflake[10];

    private int numOfShapes = 0;
    private double angle = 0.0;
    private int deltaX;
    private int deltaY;

    public Snowflake(int x, int y, int ang, int type){
        super(x,y,300,300);
        this.setBackground(new Color(1,1,1,1));
        while(numOfShapes<ang*2+4) {
            Polygon flake;
            switch (type) {
                case TEN:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, 40, 10, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
                case EIGHT:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, 40, 8, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
                case SIX:
                    flake = new Polygon(super.getWidth() / 2, super.getHeight() / 2, 40, 6, angle, Color.decode("#ffffff"));
                    this.add(flake, 0);
                    break;
            }

            numOfShapes++;

            angle = (angle + Math.PI / ang);
        }
        deltaX = gen.nextInt(10)+1;
        deltaY = gen.nextInt(10)+1;
    }

    public static void main(String[] args) {

        JFrame win = new JFrame("Snow!!!!");
        win.setBounds(100,100,1000,1000);
        win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
        win.setLayout(null);
        win.setVisible(true);
        win.getContentPane().setBackground(Color.decode("#000000"));
        int choice;

        for(int i = 0; i<flakes.length; i++){
            choice = gen.nextInt(3)+1;
            switch (choice){
                case 1:
                    flakes[i]=(tenSidedFlake(gen.nextInt(800)+1,gen.nextInt(800)+1, TEN));
                    break;
                case 2:
                    flakes[i]=(eightSidedFlake(gen.nextInt(800)+1,gen.nextInt(800)+1,EIGHT));
                    break;
                case 3:
                    flakes[i]=(sixSidedFlake(gen.nextInt(800)+1,gen.nextInt(800)+1, SIX));
                    break;
            }
            win.add(flakes[i]);
        }
        win.repaint();
    }
    public static Snowflake eightSidedFlake(int x, int y, int type){
        Snowflake s1 = new Snowflake(x,y,gen.nextInt(8)+1, type);
        return s1;
    }
    public static Snowflake sixSidedFlake(int x, int y, int type){
        Snowflake s1 = new Snowflake(x,y,gen.nextInt(6)+1, type);
        return s1;
    }
    public static Snowflake tenSidedFlake(int x, int y, int type){
        Snowflake s1 = new Snowflake(x,y,gen.nextInt(12), type);
        return s1;
    }

}
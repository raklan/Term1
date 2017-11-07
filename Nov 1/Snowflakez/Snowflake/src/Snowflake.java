import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Snowflake extends Rectangle{

    private static final int TEN = 1;
    private static final int EIGHT = 2;
    private static final int SIX = 3;

    private static int fps = 40;

    private static int numOfFlakes = 0;

    static Random gen = new Random();

    static Timer t = new Timer();

    static Snowflake[] flakes = new Snowflake[10];

    private int numOfShapes = 0;
    private double angle = 0.0;
    private int deltaX;
    private int deltaY;

    public Snowflake(int x, int y, int n, int ang){
        super(x,y,300,300);
        this.setBackground(new Color(1,1,1,1));
        while(numOfShapes<ang*2+4) {

            Polygon flake = new Polygon(super.getWidth()/2, super.getHeight()/2, 40, n, angle, Color.decode("#ffffff"));

            this.add(flake, 0);
            numOfShapes++;

            angle = (angle + Math.PI / ang);
        }
        deltaX = gen.nextInt(10)+1;
        deltaY = gen.nextInt(10)+1;
        t.schedule(new MyTimerTask(), 0,1000/fps);
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
                    flakes[i]=(tenSidedFlake(gen.nextInt(800)+1,-200));
                    break;
                case 2:
                    flakes[i]=(eightSidedFlake(gen.nextInt(800)+1,-200));
                    break;
                case 3:
                    flakes[i]=(sixSidedFlake(gen.nextInt(800)+1,-200));
                    break;
            }
            win.add(flakes[i]);
        }
        win.repaint();
    }
    public static Snowflake eightSidedFlake(int x, int y){
        Snowflake s1 = new Snowflake(x,y,8,gen.nextInt(8)+1);
        return s1;
    }
    public static Snowflake sixSidedFlake(int x, int y){
        Snowflake s1 = new Snowflake(x,y,6,gen.nextInt(6)+1);
        return s1;
    }
    public static Snowflake tenSidedFlake(int x, int y){
        Snowflake s1 = new Snowflake(x,y,10,gen.nextInt(12));
        return s1;
    }

    public void move(){
        this.setLocation(this.getX()+deltaX, this.getY()+deltaY);
    }

    public class MyTimerTask extends TimerTask
    {
        @Override
        public void run() {

        }
    }
}

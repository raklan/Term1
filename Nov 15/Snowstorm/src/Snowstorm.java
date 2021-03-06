import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snowstorm extends ButtonWindow{

    private ButtonWindowFrame win;

    private static Random gen = new Random();

    private Snowflake[] flakes = new Snowflake[350];

    public Snowstorm(){
        win = new ButtonWindowFrame("Snowstorm");
        win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
        win.setBounds(50,50,1000,1000);
        win.setLayout(null);
        win.getContentPane().setBackground(Color.BLACK);
        win.addAnimateButton(0,0,100,50);

        for(int i = 0; i<flakes.length; i++){
            flakes[i] = new Snowflake(gen.nextInt(900)+1,((gen.nextInt(500)+200)*-1), 10,gen.nextInt(6)+1, gen.nextInt(200)+1);
            flakes[i].setVisible(true);
            win.add(flakes[i]);
        }

        win.repaint();
    }

    public static void main(String[] args) {

        Snowstorm theStorm = new Snowstorm();

    }

    public void act(){
        for(int i=0;i<flakes.length;i++){
            if(flakes[i].moveFlake(win.getHeight(), win.getWidth())) {
                flakes[i].spawn();
                flakes[i].setDeltas(gen.nextInt(2)+1, gen.nextInt(4)+1);
            }
        }
    }
    public void resetAction(){}

}

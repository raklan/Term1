import javax.swing.*;
import java.awt.*;

public class Raceway extends ButtonWindow{

    private ButtonWindowFrame win;
    private Racer racerOne, racerTwo;
    private boolean done;
    private JLabel winner;
    private Timer t;

    public Raceway(){

        win = new ButtonWindowFrame("Welcome to the Races!");
        win.addAnimateButton(650,450,100,25);
        //track1();
        //track2();
        winner = new JLabel("Get Set...");
        winner.setBounds(25,450,200,25);
        win.add(winner,0);
        done = false;

        Rectangle track = new Rectangle(100,100,500,500);
        track.setBackground(Color.decode("#000000"));
        Rectangle middle = new Rectangle(100,100,300,300);
        middle.setBackground(Color.decode("#ffffff"));

        win.add(track,0);
        track.add(middle,0);

        racerOne = new Racer(25,25,50,50, "spaceship.png");
        track.add(racerOne);

        win.repaint();

    }
    public void act(){
        win.animate();
        racerOne.move();
    }

    public static void main(String[]args){

        Raceway theRace = new Raceway();

    }

}

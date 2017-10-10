import javax.swing.*;
import java.awt.*;

public class Raceway extends ButtonWindow{


    private ButtonWindowFrame win;
    private Racer racerOne, racerTwo;
    private boolean done;
    private JLabel winner;

    public Raceway(){

        win = new ButtonWindowFrame("Welcome to the Races!");
        win.setBounds(50,50,1500,1500);
        win.addAnimateButton(650,450,100,25);
        //track1();
        //track2();
        winner = new JLabel("Get Set...");
        winner.setBounds(25,650,200,25);
        win.add(winner,0);
        done = false;

        Rectangle track = new Rectangle(100,100,500,500);
        track.setBackground(Color.decode("#000000"));
        Rectangle middle = new Rectangle(100,100,300,300);
        middle.setBackground(Color.decode("#ffffff"));

        Rectangle track2 = new Rectangle(800,100,500,500);
        track.setBackground(Color.decode("#000000"));
        Rectangle middle2 = new Rectangle(100,100,300,300);
        middle2.setBackground(Color.decode("#ffffff"));

        win.add(track,0);
        track.add(middle,0);
        win.add(track2,0);
        track2.add(middle2,0);

        racerOne = new Racer(25,25,50,50, "spaceship.png");
        racerTwo = new Racer(25,25,50,50, "spaceship.png");
        track.add(racerOne);
        track2.add(racerTwo);

        win.repaint();

    }
    public void act(){

        if(racerOne.getDone()==false&&racerTwo.getDone()==false) {
            racerOne.move();
            racerTwo.move();
        }
        else if(racerOne.getDone()==true)
            winner.setText("The Left Racer Wins!");
        else if(racerTwo.getDone()==true)
            winner.setText("The Right Racer Wins!");
    }

    public static void main(String[]args){

        Raceway theRace = new Raceway();

    }

}

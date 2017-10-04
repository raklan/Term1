import javax.swing.*;

public class Raceway extends ButtonWindow{

    private ButtonWindowFrame win;
    private Racer racerOne, racerTwo;
    private boolean done;
    private JLabel winner;

    public Raceway(){

        win = new ButtonWindowFrame("Welcome to the Races!");
        win.addActButton(350,450,100,25);
        //track1();
        //track2();
        racerOne = new Racer(50,50,100,100, "spaceship.png");
        win.add(racerOne);
        winner = new JLabel("Get Set...");
        winner.setBounds(50,450,200,25);
        win.add(winner,0);
        done = false;
        win.repaint();

    }
    public void act(){
        racerOne.move();
    }
    public static void main(String[]args){

        Raceway theRace = new Raceway();

    }

}

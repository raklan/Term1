import java.awt.*;

public class World extends ButtonWindow{

    private ButtonWindowFrame win;
    private Rectangle border;
    private Rectangle middle;
    private Ball theBall;

    public World(){

        win = new ButtonWindowFrame("Bouncing Ball");
        win.setBounds(50,50,1510,900);
        win.addAnimateButton(650,750,100,25);
        win.addResetButton(650,800,100,25);

        border = new Rectangle(0,0,1500,700);
        border.setVisible(true);
        win.add(border,0);

        middle = new Rectangle(20,20,1460,660);
        middle.setBackground(Color.decode("#ffffff"));
        middle.setVisible(true);
        border.add(middle,0);

        theBall = new Ball(10,10,50,50);
        middle.add(theBall,0);

        win.repaint();

    }

    public void act(){
        theBall.move(middle);
    }
    public void resetAction() {
        win.stop();
        theBall.reset();
        win.setAnimateButtonText("Start");
    }

    public static void main(String[] args) {
        World theWorld = new World();
    }
}

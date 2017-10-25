import java.awt.*;

public class World extends ButtonWindow{

    private ButtonWindowFrame win;
    private Rectangle border;
    private Rectangle middle;
    private Ball theBall;
    private Ball theOtherBall;

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

        theBall = new Ball(10,10,75,75, "#8700c6");
        middle.add(theBall,0);

        theOtherBall = new Ball(1360,10,75,75, "#ff0000");
        middle.add(theOtherBall,0);

        theOtherBall.setDeltaX(theOtherBall.getDeltaX()*-1);

        win.repaint();

    }

    public void act(){
        theBall.move(middle, theOtherBall.getTop(), theOtherBall.getBottom(), theOtherBall.getLeft(), theOtherBall.getRight());
        theOtherBall.move(middle, theBall.getTop(), theBall.getBottom(), theBall.getLeft(), theBall.getRight());
    }
    public void resetAction() {
        win.stop();
        theBall.reset();
        theOtherBall.reset();
        win.setAnimateButtonText("Start");
    }

    public static void main(String[] args) {
        World theWorld = new World();
    }
}

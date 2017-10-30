import javax.swing.*;
import java.awt.*;

public class World extends ButtonWindow{

    private ButtonWindowFrame win;

    private Rectangle border;
    private Rectangle middle;

    private Ball theBall;

    private Ball hole;
    private Ball hole2;
    private Ball hole3;
    private Ball hole4;

    private JLabel label;

    public World(){

        label = new JLabel("");
        label.setBounds(50,800,1000,100);
        label.setVisible(true);

        win = new ButtonWindowFrame("Bouncing Ball");
        win.setBounds(50,50,1510,900);
        win.addAnimateButton(650,750,100,25);
        win.addResetButton(650,800,100,25);

        border = new Rectangle(0,0,1500,700);
        border.setVisible(true);
        border.setBackground(Color.decode("#724a00"));
        win.add(border,0);

        middle = new Rectangle(20,20,1460,660);
        middle.setBackground(Color.decode("#016300"));
        middle.setVisible(true);
        border.add(middle,0);

        theBall = new Ball((middle.getWidth()/2)-60,(middle.getHeight()/2)-60,75,75, "#ffffff");
        middle.add(theBall,0);

        theBall.setDeltaX(theBall.getDeltaX()*-1);

        hole = new Ball(middle.getWidth()-80,middle.getHeight()-80,120,120, "#000000");
        middle.add(hole,0);

        hole2 = new Ball(-40,middle.getHeight()-80,120,120, "#000000");
        middle.add(hole2,0);

        hole3 = new Ball(middle.getWidth()-80,-40,120,120, "#000000");
        middle.add(hole3,0);

        hole4 = new Ball(-40,-40,120,120, "#000000");
        middle.add(hole4,0);

        win.add(label,0);

        win.repaint();

    }

    public void act(){
        if(theBall.canMove) {
            theBall.move(middle);

            if(theBall.checkCollision(hole.getTop(), hole.getBottom(), hole.getLeft(), hole.getRight()))
                label.setText("The Ball Went in the BOTTOM RIGHT Pocket after bouncing "+theBall.getCount()+" times.");
            else if(theBall.checkCollision(hole2.getTop(), hole2.getBottom(), hole2.getLeft(), hole2.getRight()))
                label.setText("The Ball Went in the BOTTOM LEFT Pocket after bouncing "+theBall.getCount()+" times.");
            else if(theBall.checkCollision(hole3.getTop(), hole3.getBottom(), hole3.getLeft(), hole3.getRight()))
                label.setText("The Ball Went in the TOP RIGHT Pocket after bouncing "+theBall.getCount()+" times.");
            else if(theBall.checkCollision(hole4.getTop(), hole4.getBottom(), hole4.getLeft(), hole4.getRight()))
                label.setText("The Ball Went in the TOP LEFT Pocket after bouncing "+theBall.getCount()+" times.");
        }
    }
    public void resetAction() {
        theBall.reset();
        win.stop();
        hole.reset();
        win.setAnimateButtonText("Start");
        label.setText("");
    }

    public static void main(String[] args) {
        World theWorld = new World();
    }
}

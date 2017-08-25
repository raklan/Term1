import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Landscape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Landscape
{
    public static void main(String[]args){
    
        JFrame frame = new JFrame("Landscape");
        frame.setBounds(200,100,1000,1000);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        //frame
        Rectangle pictureFrame = new Rectangle(200,200,600,600);
        pictureFrame.setBackground(Color.decode("#66480d"));
        frame.add(pictureFrame,0);
        
        //picture itself
        Rectangle back = new Rectangle(50,50,500,500);
        pictureFrame.add(back,0);
        back.setBackground(Color.decode("#26ffe5"));
        
        //grass
        Rectangle grass = new Rectangle(0,400,500,100);
        back.add(grass,0);
        grass.setBackground(Color.decode("#058405"));
        
        
        //mountain
        Triangle mountain = new Triangle(150,25,500,400,0,400);
        back.add(mountain,0);
        mountain.setBackground(Color.decode("#686868"));
    }
}

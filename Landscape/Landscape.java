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
        
        //snow cap
        Oval cloud = new Oval(-100,-50,500,100);
        cloud.setBackground(Color.decode("#ffffff"));
        back.add(cloud,0);
        
        //mountain
        Triangle mountain = new Triangle(150,25,500,400,0,400);
        back.add(mountain,0);
        mountain.setBackground(Color.decode("#686868"));
        
        //sun
        Oval sun = new Oval(400,-50,150,150);
        sun.setBackground(Color.decode("#ffe500"));
        back.add(sun,0);
        
        //lake
        Oval lake = new Oval(-50,425,250,60);
        lake.setBackground(Color.decode("#003bff"));
        back.add(lake,0);
        
        //treeTrunk
        Rectangle trunk = new Rectangle(350,425,15,25);
        trunk.setBackground(Color.decode("#66480d"));
        back.add(trunk,0);
        
        //leaves
        Triangle leaves = new Triangle(330,375,50,50);
        leaves.setBackground(Color.decode("#00ff00"));
        back.add(leaves,0);
        
        //==HANGY THINGY==
        
        //left side
        Line left = new Line(300,200,500,100);
        frame.add(left,0);
        
        //right side
        Line right = new Line(500,100,700,200);
        frame.add(right,0);
    }
}

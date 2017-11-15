import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** 
 * Natalie Watts
 * Neumont University
 */
public abstract class ButtonWindow  {  
 
 public abstract void resetAction();
 public abstract void inputAction();
 
 protected class ButtonWindowFrame extends JFrame implements ActionListener{
  private JButton resetButton, inputButton;
  private Container pane;
  
  public ButtonWindowFrame(String s)
  {
   super(s);
   setBounds(20, 20, 600, 500);  
   pane = getContentPane();
   pane.setLayout(null);
   setVisible(true);
  }
  
   //makes a regular click Button
  public void addResetButton(int x,int y,int w,int h)
  {
   resetButton = new JButton("RESET");
   resetButton.setBounds(x, y, w, h );
   resetButton.addActionListener(this);
   pane.add(resetButton, 0);
   pane.repaint();
  }
  public void addInputButton(int x,int y,int w,int h)
  {
   //Makes a repeating Button
   inputButton = new JButton("GUESS");
   inputButton.setBounds(x, y, w, h);
   inputButton.addActionListener(this);
   pane.add(inputButton, 0);
   pane.repaint();
  }
  public void setWinLocation(int x, int y)
  {
    this.setLocation(x,y);
  }
  public void setWinSize(int w, int h)
  {
    this.setSize(w,h);
  }
  public void setResetButtonLocation(int x, int y)
  {
    resetButton.setLocation(x,y);
  }
  public void setResetButtonSize(int w, int h)
  {
    resetButton.setSize(w,h);
  }
  public void setResetButtonText(String s)
  {
    resetButton.setText(s);
  }
    public void setInputButtonLocation(int x, int y)
  {
    inputButton.setLocation(x,y);
  }
  public void setInputButtonSize(int w, int h)
  {
    inputButton.setSize(w,h);
  }
  public void setInputButtonText(String s)
  {
    inputButton.setText(s);
  }
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == resetButton)
    resetAction(); 
   else if (e.getSource() == inputButton)
    inputAction();
  }
 }

}
package CodeQ1;
import java.awt.Graphics;

//  Circles.java
// This program draws concentric circles
import javax.swing.JFrame;
public class Circles extends JFrame 
{
   public static void main(String args[])
   {
	   JFrame frame= new JFrame();
	   frame.setTitle("Concentric Circles");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   CirclesJPanel circleJPanel=new CirclesJPanel();
	   frame.add(circleJPanel);
	   frame.setSize(200,250);
	   frame.setVisible(true);
	  
   } // end main
} // end class Circles
// Requirement 1:  the title for the frame is oncentric Circles�.  
// Requirement 2:  the size for the frame is 200 x 250.
package CodeQ2;
//  Concentric.java
// This program draws concentric circles using Graphics2D
import javax.swing.JFrame;

public class Concentric extends JFrame 
{
   public static void main(String args[])
   {
	   JFrame frame= new JFrame();
	   frame.setTitle("Concentric Circles");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   CirclesJPanel CP=new CirclesJPanel();
	   frame.add(CP);
	   frame.setSize(250,250);
	   frame.setVisible(true);
   } 
} // end class Concentric


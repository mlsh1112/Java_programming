package CodeQ2;
// Convert.java
// Temperature-conversion program
import javax.swing.JFrame;

public class Convert
{
	   public static void main(String[] args)
	   {
	      		
		   ConvertFrame converframe=new ConvertFrame();

		   converframe.setSize(225,90);
		   converframe.setTitle("Temperature converter");
		   converframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   converframe.setVisible(true);
	   }
    
    
} // end class Convert
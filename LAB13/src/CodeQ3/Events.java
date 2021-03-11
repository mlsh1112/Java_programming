package CodeQ3;
//  Events.java
// Program displays events that occur during execution.
import javax.swing.JFrame;

public class Events
{
   public static void main(String[] args)
   {
     /* Writee your code here 
     -----------------------------
     */

	   EventsFrame eventframe=new EventsFrame();
	   eventframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   eventframe.setSize(375,325);
	   eventframe.setVisible(true);
	   
	   
   } // end class Events
}


import java.awt.FlowLayout;

// Testing AlignFrame.
import javax.swing.JFrame;

public class Align 
{
   public static void main(String[] args)
   {
	 AlignFrame AF= new AlignFrame();

	 JFrame frame=new JFrame();
	 frame.setSize(300,140);
 	 frame.setTitle("Align");
 	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	 frame.setVisible(true);
 	  
 	  frame.add(AF);
 
   } 
} // end class Align



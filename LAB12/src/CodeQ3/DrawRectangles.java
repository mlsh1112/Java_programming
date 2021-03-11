package CodeQ3;
import javax.swing.JFrame;


public class DrawRectangles 
{
	public static void main(String arg[])
	{
		   JFrame frame= new JFrame();
		   frame.setTitle("Nested Rectangles");
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		   RectanglesPanel RP=new RectanglesPanel();
		   frame.add(RP);
		   frame.setSize(400,400);
		   frame.setVisible(true);
	}

}

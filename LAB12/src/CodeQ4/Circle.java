package CodeQ4;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Circle
{
   public static void main(String args[])
   {

      String r,ix,iy;
      double radius;
      int x,y;
      r=JOptionPane.showInputDialog("Enter radius");
      radius=Double.parseDouble(r);
      ix=JOptionPane.showInputDialog("Enter x-coordinate");
      x=Integer.parseInt(ix);
      iy=JOptionPane.showInputDialog("Enter y-coordinate");
      y=Integer.parseInt(iy);
      /* write your code using methods of JOptionPane class 
        do not use System.out.Println() to dispaly on the screen
        do not use methods of Scanner class and Sytem.in to accept input from user 
       */
     CirclesJPanel CP=new CirclesJPanel(radius,x,y);
     JFrame frame= new JFrame();
     frame.setSize(500,500);
	 frame.setTitle("Concentric Circles");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.add(CP);
	 frame.setVisible(true);
	   
   }
      
} // end class Circle


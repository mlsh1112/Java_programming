
//  Alignframe.java
// Program creates a simple GUI.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AlignFrame extends JFrame 
{
        
   /* Step 0: Declare  all the necessary GUI componets here.*/  
	//JFrame frame= new JFrame();
    JPanel panel_1=new JPanel();
    JPanel panel_2=new JPanel();
    JPanel panel_3=new JPanel();
    JPanel panel_4=new JPanel();
    JPanel panel_5=new JPanel();
   // constructor sets up GUI
   public AlignFrame()
   {
      super("Align");
      
     setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
    
     

      
       /* Sep 1.create two check boxes and store them in a panel_1 */
      
      JCheckBox snap=new JCheckBox ("Snap to Grid");
      JCheckBox show=new JCheckBox("Show Grid");

       panel_1.add(snap);
       panel_1.add(show);
       
       panel_1.setLayout(new GridLayout(2,1));
        
  
      /*Step 2.1 Create text fieled and its label and store then in Panel_2
       -----------------------------------------------------------
       */
       
       
      JLabel x= new JLabel("X: ");
      JTextField xt=new JTextField("8");
      panel_2.add(x);
      panel_2.add(xt);
      panel_2.setLayout(new FlowLayout(FlowLayout.CENTER));
      
      /*Step 2.2.Create text fieled and its label and store then in Panel_3
      -------------------------------------------------------
*/
      JLabel y= new JLabel("Y: ");
      JTextField yt=new JTextField("8");
      panel_3.add(y);
      panel_3.add(yt);
      panel_3.setLayout(new FlowLayout(FlowLayout.CENTER));
      /* 2.3.Store  Panel_2  and Panel_3 inside panel_4
        by putting panel_2 at North and panel_3 at South.
        ------------------------------------------------------
     */
      
      
      panel_4.setLayout(new BorderLayout());
      panel_4.add(panel_2,"North");
      panel_4.add(panel_3,"South");
      
    
      /*Step 3. Creating three Buttons and store them  in panel_5
       -------------------------------------------------- 
       */
      
      JButton Ok=new JButton("Ok");
      panel_5.add(Ok);
      JButton C=new JButton("Cancel");
      panel_5.add(C);
      JButton H=new JButton("Help");
      panel_5.add(H);
      
      panel_5.setLayout(new GridLayout(3,1,10,5));
      /* Step 4:Put Panel_1, panel_4 and panel_5 inside frame
       -----------------------------------------------
      */
      super.add(panel_1);
      super.add(panel_4);
      super.add(panel_5);
      } // end Alignframe constructor
} // end class Alignframe



package CodeQ2;
// ConvertFrame.java
// Temperature-conversion program
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertFrame extends JFrame 
{
   /* Step 1: Declare necessary Fields( GUI elements) of  a frame 
    ----------------------------------------------------------
    */
	JLabel temp=new JLabel("Enter Fahrenheit temperature");
	JTextField tf=new JTextField(10);
	//JTextField tfresult=new JTextField(10);
	JLabel result= new JLabel("Temperature in Celsius is:");
	
	
   // constructor sets up GUI
   public ConvertFrame()
   {

	   
      super("Temperature converter");
	   this.setLayout(new BorderLayout());
	   
      /* Step 2:  
       a) Cretae label with text string "Enter Fahrenheit temperature:"
       b) Create  textfield with size 10 to store value of temperature
       ------------------------------------------------ 
       */
	  
      
      
      /* Step 3: register anonymous action listener
        a) inside  actionPerformed() method, do the convertion.
        b) in actionPerformed() method, "Temperature in Celsius" is included.
       --------------------------------------------------
       */
     
	  this.add(result,BorderLayout.SOUTH);
    tf.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String strtem=tf.getText();
		double tem=Double.parseDouble(strtem);
		double cal=((double)5/9)*(tem - 32);
		String strcal="Temperature in Celsius is:"+Double.toString(cal);
		result.setText(strcal);
	}
	
   });
    
      /* Step 4: Add the Enter Fahrenheit temperure(Jlabel),
        blank textfiled(JTextField) and Temperature in Celsius(JTextFiled)
        at north, center and South location of BorderLayout Manager
       -----------------------------------------------------------
       */
    
    this.add(temp,BorderLayout.NORTH);
    this.add(tf,BorderLayout.CENTER); 
    this.add(result,BorderLayout.SOUTH);
   } // end ConvertFrame constructor
   
   
   
} // end class ConvertFrame




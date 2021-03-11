package Q3;
class Outer  
{
          class Inner 
          {
			public void M1()
             {
            	System.out.println("inner  class method is running");
              }
          }          
    
   public static void main(String[] args)
        {    
        	Outer oc= new Outer();
        	Outer.Inner in=oc.new Inner();
        	
           in.M1();
        } 
}

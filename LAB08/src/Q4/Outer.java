package Q4;

class Outer  
{
     class Inner {
    	 public void M1( )
    	 {
    		 System.out.println("inner  class method is running");
          }
      } 
     
     
         public void M2() 
         {  
             // write your code
        	 //Outer oc = new Outer();
        	 Outer.Inner in=new Inner();
        	 in.M1();
         }   
         
         
      public static void main(String[] args)
        {      
            // write your code  
    	  
    	  Outer oc2=new Outer();
    	  oc2.M2();
         } 
        
        
} 
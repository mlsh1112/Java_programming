package Q10;

class Outer  
{                              
         static class StaticInner 
         {
               public  void M1( ) 
              {
                   System.out.println( "running a method of Static inner class");   
               }
        }  
         
    public static void main(String[] args)
    {
         // write your code 
    	
    	StaticInner staticinner=new StaticInner();
    	staticinner.M1();
     }
} 

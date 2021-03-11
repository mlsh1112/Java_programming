package Q8;

class Outer
{
   private int x=10;
   private static  int y=20  ;
   public void M1( )  
  {   
       int z=30;
       class Inner    
       {
             public void M2()
             {                                                         
                   System.out.println("sum: "+ (x+y+z)); 
              }
        } 
   Inner i=new Inner();
   i.M2() ; ///  first call 
   i.M2();  // second call 
   i.M2();  // third call  
  }   // end of M1   
   
   
   public static void main(String[] args)
   {
       Outer O  = new Outer() ;
       O.M1();    ///   control starts from here
   }
   
   
}   // end of outer  class 
package Q6;

class Outer  
{
         private int x =10;   // member variable to outer class b
         private  static int y=20; // member variable to outer class 
        class Inner  
        {
             public void M1( ) 
            {   
                System.out.println(x);   
                System.out.println(y);   
            }
       }          
      public static void main(String[] args)  // method of outer class
      {
               Outer O =new Outer() ;
               Inner i  = O.new Inner() ;
               i.M1();
       } 
}

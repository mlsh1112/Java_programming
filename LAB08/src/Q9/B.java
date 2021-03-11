package Q9;

class B   // class B acts as subclass of class A
{
   public static void main(String[] args)
  {   
        A a1 = new A()  // no semi colon
        {
             public  void M1()
              {
                  //  overriding 
                 System.out.println("travel  by ship" );
               }
         } ; // semicolon 
   
      a1.M1();  // display:  travel by ship
     
     A a2 = new A();
     a2.M1();  // display: travel by plane 
  }  // end of  main()
}  // end of B
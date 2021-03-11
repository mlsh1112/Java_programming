package Q7;

class Outer
{     
       int x =10;
    class Inner
     { 
        int x=20;
       public void M1( )
          {
             int x =30;
             System.out.println(x);  // write the missing argument to display  30
             System.out.println(this.x);  //  Write the missing argument to display 20
             System.out.println(Outer.this.x);  // write the missing argument to display 10
           }
      }          
        public static void main(String[] args) 
       {
        	Outer oc= new Outer();
        	Outer.Inner in=oc.new Inner();
        	in.M1();
             //  write your code 
       } 
} // end of outer
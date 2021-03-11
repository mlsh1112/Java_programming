package Q5;

class  TestClass 
{
     public static void main(String[] args)    // how main()  method call  M1() 
       {
    	 Outer oc = new Outer();
    	 Outer.Inner in=oc.new Inner();
     	
    	 in.M1();
          // write your code 
    }
}  
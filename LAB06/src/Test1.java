 class Test1
 {
    int i;
   
    public Test1 (int i)
    {
       this.i=i;
    }
     public int hashCode()
    {
     return i;
    } 

//    public String toString()
//    {
//       return i + " ";
//   }

     public static void main (String []args)
     {
       Test1 t1 = new Test1 (10);
       Test1 t2 = new Test1 (100);
       System.out.println (t1);
       System.out.println (t2);
    } 
 }

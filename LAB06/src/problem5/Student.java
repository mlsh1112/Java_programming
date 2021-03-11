package problem5;

 class Student
 {
    String name;
    int ID;
	private Object e; 
    public Student (String name, int ID)
    {
      this.name=name;
      this.ID=ID;
    }

  /*  public boolean equals(Object obj)  // S1.equal(S2)
    {
       try   
       {
           String name1 =this.name; // this refers to S1.
          int ID1=this.ID;

          Student s=(Student)obj;   
          String name2 =s.name;
          int ID2 =s.ID;

        if( name1.equals(name2)&& (ID1==ID2))          
            return true;
         else
              return false;
       }// end of try block

      catch( ClassCastException e)
      {
         return false;                                        
      }
       catch( NullPointerException e)
      {
        return false;                                        
      }
} // end of equals()
   
*/

           public boolean equals(Object obj) // S1.equal(S2)
           {    
                if(obj == this)// instead of comparing field by field 
                {
                  return true;
                }
                if(obj instanceof Student)
                {
                        Student s =(Student)obj;   
                        if( name.equals(s.name)&& (ID==s.ID) ) 
                      {         
                            return false;
                         }
                        else
                         {
                           return false;
                        }
                 }// end of if block
                else
                {
                    return false;
                }        
         } // end of equals()    
  

    
    
    
   public static void main (String []args )
   {
      Student S1 = new Student("kim", 101);
      Student S2 = new Student ("Homin", 102);
      Student S3 = new Student ("Homin", 102);           
      Student S4 = S1;
       System.out.println ( S1.equals(S2));                               
       System.out.println ( S1.equals(S3));                                   
       System.out.println ( S1.equals(S4));
      System.out.println ( S1.equals("kim"));                                                        
      System.out.println ( S1.equals(null));                                                       
  } 
 } 

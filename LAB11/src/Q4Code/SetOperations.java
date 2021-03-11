package Q4Code;
// SetOperations.java
import java.util.HashSet;
import java.util.Set;

public class SetOperations
{
  public static Set<String> union(Set<String> s1, Set<String> s2)
  {
	  Set<String> un=new HashSet<String>();
	  /*  
		 Write your code to  complete the code of this method  
	  */
	  for(String set1:s1) {
		  un.add(set1);
	  }
	  for(String set2: s2) {
		  un.add(set2);
	  }
	 
	 return un;
  }
  public static Set<String> intersection(Set<String> s1, Set<String> s2)
  {
	  Set<String> un=new HashSet<String>();
	  /*
	     Write your code to complete the code of this method   
	   */
	  for(String set1:s1) {
			 for(String set2: s2) {
				 if(set1.equals(set2)) {
					 un.add(set1);
				 }
			 }
		 }
	  
	  return un;
  }
  public static Set<String> difference(Set<String> s1, Set<String> s2)
  {
	  Set<String> un=new HashSet<String>();
	  Set<String> a=new HashSet<String>();
	  Set<String> b=new HashSet<String>();
	  /*
	    Write your code to complete the code of this method   
	   */
	  for(String set1:s1) {
		  a.add(set1);
	  }
	  for(String set2: s2) {
		  a.add(set2);
	  }
	  
	  for(String set1:s1) {
			 for(String set2: s2) {
				 if(set1.equals(set2)) {
					 b.add(set1);
				 }
			 }
		 }
	  for(String i:b) {
		  for(String j:a) {
			  if(!(i.equals(j)))
					  un.add(j);
		  }
	  }
	  
	  return un;
	  
  }
 public static void main(String args[])
 {
	Set<String> footBallTeam=new HashSet<String>();
	footBallTeam.add("Frank");
	footBallTeam.add("Amjad");
	footBallTeam.add("Jim");
	
	Set<String> basketBallTeam=new HashSet<String>();
	basketBallTeam.add("David");
	basketBallTeam.add("Frank");
	basketBallTeam.add("Scott");
	
	Set<String> unionSet=union(footBallTeam,basketBallTeam);
	Set<String> intersectionSet=intersection(footBallTeam,basketBallTeam);
	Set<String> differenceSet=difference(footBallTeam,basketBallTeam);
	for(String member:intersectionSet)
	System.out.print(member);
	System.out.println();
	
	for(String member:unionSet)
	System.out.print(member);
	System.out.println();
	
	for(String member:differenceSet)
	System.out.print(member);
  }

}// end of the class 

package Q3_PartialCode;

public class GenericMethodTest 
{
   public static void main(String[] args) 
   {
      // create arrays of Integer, Double and Character
      Integer[] integerArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
      String[] stringArray = {"one", "two", "three", "four", 
         "five", "six", "seven", "eight"};

      System.out.println("Array integerArray contains:");
      printArray(integerArray); // call generic with an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray); // call generic with a Double array

      System.out.println("\nArray characterArray contains:");
      printArray(characterArray); // call generic with a Character array

      System.out.println("\nArray stringArray contains:");
      printArray(stringArray); // method specific to string arrays
   }
   
   // generic method printArray
   public static <T> void printArray(T[] inputArray) {
		 for(T element: inputArray)
			 System.out.printf("%s ",element);
		 
		 System.out.println();
	 }

   // method that prints array of strings in tabular format
   public static void printArray(String[] Array) {
	   for(int i=0;i<Array.length;i++) {
		   System.out.printf("%s ",Array[i]);
		   if(i==Array.length/2-1)
			   System.out.println();
	   }
   }
   

} // end class GenericMethodTest
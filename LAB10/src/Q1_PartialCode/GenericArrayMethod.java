package Q1_PartialCode;

public class GenericArrayMethod
{        
 public static void main(String args[])
  {
	// create arrays of Integer, Double and Character
    Integer[] integerArray = {1, 2, 3, 4, 5, 6}; 
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
    Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.print("Array integerArray before reverse\n");
    printArray(integerArray); 
    reverseArray(integerArray);
    System.out.print("Array integerArray after reverse\n");
    printArray(integerArray); 
    
    System.out.print("Array doubleArray before reverse\n");
    printArray(doubleArray);  
   reverseArray(doubleArray);
    System.out.print("Array doubleArray after reverse\n");
    printArray(doubleArray); 
    
    System.out.print("Array characterArray before reverse\n");
    printArray(characterArray);  
   reverseArray(characterArray);
    System.out.print("Array characterArray after reverse\n");
    printArray(characterArray); 
 } 

 public static <T> void printArray(T[] inputArray) {
	 for(T element: inputArray)
		 System.out.printf("%s ",element);
	 
	 System.out.println();
 }
 
 public static <T> void reverseArray(T[] inputArray) {
	 for(int i=0 , j=inputArray.length-1;i<inputArray.length/2;i++,j--) {
		 T temp=inputArray[i];
		 inputArray[i]=inputArray[j];
		 inputArray[j]=temp;
	 }
 }
 
 
} // end class GenericMethodTest
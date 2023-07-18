package June_2.grooming;

public class SortingArray {
//	// Java Program to Sort Elements of an Array
//	// in Ascending Order
//
//	// Main class
//	
//
//		// Declaration global variable length
//		static int length;
//
//		// Method 1
//		// To print the array
//		public static void printArray(int[] array)
//		{
//			// Iterating using for loops
//			for (int i = 0; i < length; i++) {
//				System.out.print(array[i] + " ");
//			}
//			System.out.println();
//		}
//
//		// Method 2
//		// To sort an array
//		public static void sortArray(int[] array)
//		{
//			int temporary = 0;
//
//			// Sort the array 'arr' elements in ascending order
//			// using nested for loops
//			for (int i = 0; i < length; i++) {
//				for (int j = i + 1; j < length; j++) {
//					if (array[i] > array[j]) {
//						temporary = array[i];
//						array[i] = array[j];
//						array[j] = temporary;
//					}
//				}
//			}
//
//			// Displaying elements of array after sorting
//			System.out.println(
//				"Elements of array sorted in ascending order: ");
//			printArray(array);
//		}
//
//		// Method 3
//		// Main driver method
//		public static void main(String[] args)
//		{
//			// Initializing custom array elements
//			// The array contains 6 elements.
//			int[] array = new int[] { -5, -9, 8, 12, 1, 3 };
//
//			// Initialize length
//			length = array.length;
//
//			// Displaying elements of original array
//			System.out.print("Elements of original array: ");
//
//			// Call printArray method
//			printArray(array);
//
//			// Call sortArray method
//			sortArray(array);
//		}
	
	public static void main(String[] args) {
		int [] arr = new int [] {5, 2, 8, 7, 1};     
	     int temp = 0;    
	     for (int i = 0; i < arr.length; i++) {     
	         for (int j = i+1; j < arr.length; j++) {     
	            if(arr[i] > arr[j]) {    
	                temp = arr[i];    
	                arr[i] = arr[j];    
	                arr[j] = temp;    
	            }     
	         }     
	     } 
	     System.out.println();
	     for(int i=0;i<arr.length;i++) {
	    	 System.out.print(arr[i]+" ");
	     }
	}
	    
    
}

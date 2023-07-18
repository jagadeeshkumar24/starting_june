package June_2.grooming;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestNumber {

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the size of array");//{10, 20, 25, 63, 96, 57};
		int size = sc.nextInt();
		int []array = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter a values");
			array[i]=sc.nextInt();
		}
//		int temp =0;
//		for(int i=0,j=i+1;i<a.length;i++) {
//			if(a[i]>a[j]) {
//				temp =a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//		System.out.println("3rd largest number: "+a[size-1]);
////		if(c==3) {
////			System.out.println("3 largest number of: "+max);
////		}

//		int array[] = {10, 20, 25, 63, 96, 57};
//	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int max = array[size-3];
	      System.out.println("3rd largest element is :"+max);
	}

}

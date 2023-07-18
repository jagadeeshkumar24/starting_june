package June_2.grooming;

import java.util.Arrays;

public class SecondLargestAry {
	static void print2largest(int arr[],int arr_size) {
		int i,largest,second;
		if(arr_size<2) {
			System.out.println("invalid array");
			return;
		}
		Arrays.sort(arr);
		
		for(i=arr.length-2;i>=0;i++ ) {
			if (arr[i] != arr[arr_size - 1])
		    {
		      System.out.printf("The second largest " +
		                        "element is %d\n", arr[i]);
		      return;
		    }
	}
		System.out.printf("There is no second " +
                "largest element\n");
	}
	public static void main(String[] args) {
		int arr[] = {12, 35, 1, 10, 34, 1};
		  int n = arr.length;
		  print2largest(arr, n);
	}
}


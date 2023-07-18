package omprakash;

public class Arrays_sort1 {
	public static void main(String[] args) {
		int a[]= {5,4,33,66,55,77,88,99,2,3};
		System.out.println("Before Sorting   :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		//bubble sorting one type
		System.out.println("\n after sorting: ");
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}

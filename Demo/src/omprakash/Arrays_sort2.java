package omprakash;

import java.util.Iterator;

public class Arrays_sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,6,8,33,56,74,22,65};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
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
		
	}

}

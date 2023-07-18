package arrayprograms;

import java.util.Scanner;

public class EvenArray1 {
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int[] a =new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the values in array");
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]%2==0) {
				System.out.print(a[j]+" ");
			}
		}
		System.out.print("[");
		for(int i : a) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.print("]");
		
	}
}

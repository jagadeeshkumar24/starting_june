package parctise;

import java.util.Scanner;

public class FibonacciArr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		int []a= new int[size];
		 a[0]=0;
		 a[1]=1;
		for(int i=2;i<a.length;i++) {
			System.out.println("enter the values");
			a[i]=scanner.nextInt();
			a[i]=a[i-1]+a[i-2];
			
		}
		System.out.println("the fibonacci: "+a[size-1]);
		
		

	}

}

package parctise;

import java.util.Scanner;

public class EvenArr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		int []a= new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the values");
			a[i]=scanner.nextInt();
		}
		
		
		//for even elements in the array
//		for(int j : a) {
//			if(j%2==0) {
//				System.out.print(j + " ");
//			}
//		}
		
		//occrance given the array
		for(int k=0;k<a.length;k++) {
			int c =1;
			for(int j=k+1;j<a.length;j++) {
				if(a[k]==a[j]) {
					c++;
					a[j]=1;
				}
			}
			if(c>=1 && a[k]!=1) {
				System.out.println(a[k]+"occrance of : "+c);
			}
		}
		
		//
		
	}

}

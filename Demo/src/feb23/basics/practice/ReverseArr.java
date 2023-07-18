package feb23.basics.practice;

import java.util.Scanner;

public class ReverseArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the given number");
		int size =sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the values");
			a[i]=sc.nextInt();
		}
		int n=a.length;
		for(int j=n-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}
	}

}

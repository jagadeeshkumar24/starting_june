package June_2.arrays;

import java.util.Scanner;

public class CharArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the size");
		int size = sc.nextInt();
		int []obj = new int[size];
		for(int i=0;i<obj.length;i++) {
			System.out.println("enter the values");
			obj[i] = sc.nextInt();
		}
		System.out.print("[");
		for (int i : obj) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.print("]");
	}
}

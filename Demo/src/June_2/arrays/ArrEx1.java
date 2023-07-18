package June_2.arrays;

import java.util.Scanner;

public class ArrEx1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter  no of days");
		int size = sc.nextInt();
		String [] obj = new String[size];
		for(int i=0;i<obj.length;i++) {
			System.out.println("enter day");
			obj[i] = sc.next();
		}
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}

}

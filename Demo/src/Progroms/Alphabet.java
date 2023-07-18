package Progroms;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
//		char ch='A';
		for(int i=1;i<=num;i++) {
			if(i==num)
			System.out.println(i+"character of: "+((char)(i+64)));
		}
	}

}

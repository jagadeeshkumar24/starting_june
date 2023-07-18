package feb23.basics.practice;

import java.util.Scanner;

public class Revese {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the given number");
		int n =sc.nextInt();
		int rev=0,rem;
		for(;n!=0;n/=10) {
			rem =n%10;
			rev =rev*10 + rem;
		}
		System.out.println(rev);
	}
}

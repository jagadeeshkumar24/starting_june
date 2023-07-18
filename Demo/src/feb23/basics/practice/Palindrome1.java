package feb23.basics.practice;

import java.util.Scanner;

public class Palindrome1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the number");
		int num=sc.nextInt();
				
		int num1=num;
		int rem;
		int rev=0;
		while(num>0) {
			rem=num%10;
			rev=(rev*10) + rem;
			num=num/10;
		}
		if(num1==rev) {
			System.out.println(num1+" is palindrome");
		}
		else {
			System.out.println(num1+" is not palindrome");
		}
	}
}

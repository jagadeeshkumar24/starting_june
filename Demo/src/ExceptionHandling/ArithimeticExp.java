package ExceptionHandling;

import java.util.Scanner;

public class ArithimeticExp {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the numirator");
		int a=sc.nextInt();
		System.out.println("enter the denomirator");
		int b=sc.nextInt();
		try {
		int c =a/b;//ArithmeticException
		System.out.println(c);
		}
		catch(ArithmeticException s){
			System.out.println("kindly can't divide by zero ");
		}
	}
}

package feb23.basics.practice;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
//		int num=371;
		int temp=num;
		int sum=0;
		int rem;
		int result = count(num);
		while(num>0) {
			rem=num%10;
			sum=sum+multiply(rem,result);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is palindrome");
			
		}else {
			System.out.println(temp+" is not palindrome");
		}
		
	}
	public static int count(int num) {
		int c=0;
		while(num>0) {
			c++;
			num=num/10;
		}
		return c;
	}
	public static int multiply(int num,int power) {
		int pro=1;
		for(int i=1;i<=power;i++) {
			pro=pro*num;
		}
		return pro;
	}
}

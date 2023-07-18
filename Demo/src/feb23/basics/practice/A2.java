package feb23.basics.practice;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the given number");
		int n =sc.nextInt();
		int pro =1,c=0;
//		while(n!=0) {
//			c++;
//			n=n/10;
//		}
//		System.out.println(c);//for count purpose
//		for(int i=1;i<=n;i+=2) {
////			
//			 pro= pro*i;
////			 if(i%2==0)
//		}
//		System.out.println(pro);//product of given no
		int rem ;
		for(;n!=0;n/=10) {
			 rem = n%10;
			 if(rem%2==1)
			 System.out.println(rem);//extracts the given number
		}
	}
}

package demo;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size the array");
		int size=scanner.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++) { 
			a[i]=scanner.nextInt();
		}
		int count=0;
		for(int j=0;j<size;j++) {
			if(fibonacci(a[j]))
				count++;
		}
		
		System.out.println(count);
	}
	public static  boolean fibonacci(int n){
		int a=0,b=1,c;
		while((a+b)<=n) {
			c=a+b;
			if(c==n)
				return true;
			a=b;
			b=c;
			
		}
		return false ;
	}

}

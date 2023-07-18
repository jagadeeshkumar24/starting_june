package Progroms;
import java.util.*;
public class PrimeMethod2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a starting number");
		int num1=scanner.nextInt();
		System.out.println("enter a ending number");
		int num2=scanner.nextInt();
		for(int i=num1;i<=num2;i++) {
			if (prime(i))
				System.out.println(i);
		}
	}
	public static boolean prime(int n) {
		int count=0;
		if(n<2)
			return false;
		for(int i=2;i<Math.sqrt(n);i++) {//logic -- n or n/2 or Math.sqrt(n) any logic used
			if(n%i==0)
				return false;
		}
		return true;
	}
	
}

package Progroms;
import java.util.*;
public class PrimeMethod1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a starting number");
		int num1=scanner.nextInt();
		System.out.println("enter a ending number");
		int num2=scanner.nextInt();
		for(int i=num1;i<=num2;i++) {
			if(prime(i))
			System.out.println(i);
			if(prime1(i))
				System.out.println(i);
			
		}
	}
	public static boolean prime(int num) {
		int count=0;
		if(num<2) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}	
		}
		return true;
		
		
	}
	public static boolean prime1(int num) {
		//int c=0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false; 
			}
		}
		return true;	
	}

}

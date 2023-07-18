package demo;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size the array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter the elements of the array");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		//int a[]= {5,2,6,8,1,9};
		int pro=1;
		for(int i=0;i<a.length;i++) {
			if(prime(a[i])){
			pro=pro*a[i];
			}
		}
//		prime(true);
		System.out.print(pro);
		

	}
	public static boolean prime(int n){
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==2) {//if can use---> (return count==2;)
			return true;
		}else {
			return false;
		}
		
	}

}

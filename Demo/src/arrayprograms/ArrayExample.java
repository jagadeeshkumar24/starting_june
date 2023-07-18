package arrayprograms;
import java.util.Scanner;
public class ArrayExample {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		int size=scanner.nextInt();
		int[] obj=new int[size];
		for(int i=0;i<=obj.length-1;i++) {
			System.out.println("enter the values");
			obj[i]=scanner.nextInt();
		}
//		for(int i=0;i<obj.length;i++) {
//			System.out.println(obj[i]);
//		}
		System.out.print("[");
		for(int a:obj) {
			System.out.print(a+" ");
		}
		System.out.print("]");
	}
}
